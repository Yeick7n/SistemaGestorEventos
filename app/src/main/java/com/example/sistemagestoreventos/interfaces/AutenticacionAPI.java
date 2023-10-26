package com.example.sistemagestoreventos.interfaces;

import com.example.sistemagestoreventos.modelo.autenticacion.AutenticacionLoginModel;
import com.example.sistemagestoreventos.modelo.autenticacion.AutenticacionLoginResModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AutenticacionAPI {
    @POST("auth/login")
    Call<AutenticacionLoginResModel> postLogin(@Body AutenticacionLoginModel autenticacionLoginModel);
    
}
