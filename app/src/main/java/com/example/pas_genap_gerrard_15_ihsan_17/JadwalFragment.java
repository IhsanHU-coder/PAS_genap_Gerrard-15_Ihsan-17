package com.example.pas_genap_gerrard_15_ihsan_17;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JadwalFragment extends Fragment {

    private RecyclerView recyclerView;
    private TeamAdapterLain teamAdapterLain;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jadwal, container, false);

        recyclerView = view.findViewById(R.id.rvTeamsLain);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        teamAdapterLain = new TeamAdapterLain();
        recyclerView.setAdapter(teamAdapterLain);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.thesportsdb.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIJadwalBelanda api = retrofit.create(APIJadwalBelanda.class);

        api.getTeamsLain().enqueue(new Callback<TeamResponseLain>() {
            @Override
            public void onResponse(Call<TeamResponseLain> call, Response<TeamResponseLain> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Log.d("API_RESPONSE", "Jumlah liga: " + response.body().getTeamsLain().size());
                    teamAdapterLain.setTeamsLain(response.body().getTeamsLain());
                } else {
                    Log.e("API_RESPONSE", "Response gagal atau body null");
                    Toast.makeText(getContext(), "Data kosong", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<TeamResponseLain> call, Throwable t) {
                Log.e("API_ERROR", "Error saat memanggil API", t);
                Toast.makeText(getContext(), "Kesalahan: " + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
