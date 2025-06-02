// APIJadwalBelanda.java
package com.example.pas_genap_gerrard_15_ihsan_17;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIJadwalBelanda {
    @GET("api/v1/json/3/all_leagues.php")
    Call<TeamResponseLain> getTeamsLain();
}
