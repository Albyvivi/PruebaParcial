package com.example.pruebaparcial.connectors;

import com.example.pruebaparcial.model.DigimonModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("digimon")
    Call<List<DigimonModel>> getGames();

}
