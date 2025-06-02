// TeamResponseLain.java
package com.example.pas_genap_gerrard_15_ihsan_17;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TeamResponseLain {
    @SerializedName("leagues")
    private List<TeamLain> teamsLain;

    public List<TeamLain> getTeamsLain() {
        return teamsLain;
    }

    public void setTeamsLain(List<TeamLain> teamsLain) {
        this.teamsLain = teamsLain;
    }
}
