package com.example.pas_genap_gerrard_15_ihsan_17;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class TeamAdapterLain extends RecyclerView.Adapter<TeamAdapterLain.TeamViewHolder> {

    private List<TeamLain> teamsLain = new ArrayList<>();

    @Override
    public TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.teamlain_itemlayout, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TeamViewHolder holder, int position) {
        TeamLain team = teamsLain.get(position);
        holder.teamLeague.setText(team.getStrLeague());
        holder.teamId.setText(team.getIdLeague());
        holder.teamSport.setText(team.getStrSport());
    }

    @Override
    public int getItemCount() {
        return teamsLain.size();
    }

    public void setTeamsLain(List<TeamLain> teamsLain) {
        this.teamsLain = teamsLain;
        notifyDataSetChanged();
    }

    static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView teamLeague, teamSport, teamId;

        public TeamViewHolder(View itemView) {
            super(itemView);
            teamLeague = itemView.findViewById(R.id.teamLeague);
            teamSport = itemView.findViewById(R.id.teamSport);
            teamId = itemView.findViewById(R.id.teamId);
        }
    }
}
