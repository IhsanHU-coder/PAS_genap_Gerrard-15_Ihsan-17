package com.example.pas_genap_gerrard_15_ihsan_17;

import com.google.gson.annotations.SerializedName;

public class TeamLain {
    @SerializedName("idLeague")
    private String idLeague;

    @SerializedName("strLeague")
    private String strLeague;

    @SerializedName("strSport")
    private String strSport;

    public String getIdLeague() {
        return idLeague;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public String getStrSport() {
        return strSport;
    }
}
