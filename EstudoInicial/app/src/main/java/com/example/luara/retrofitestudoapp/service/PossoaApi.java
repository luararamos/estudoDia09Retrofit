package com.example.luara.retrofitestudoapp.service;

import com.example.luara.retrofitestudoapp.POJO.Pessoa;
import com.example.luara.retrofitestudoapp.POJO.PessoasResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PossoaApi {
    @GET("/api")
    Call<PessoasResponse> getPessoa()/* usada no DAO getPosts()*/;

}
