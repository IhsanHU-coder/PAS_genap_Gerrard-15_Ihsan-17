package com.example.pas_genap_gerrard_15_ihsan_17;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APISpanyol {
    @GET("api/v1/json/3/search_all_teams.php?l=Spanish%20La%20Liga")
    Call<TeamResponse> getTeams();
}
