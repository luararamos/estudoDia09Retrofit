package com.example.luara.retrofitestudoapp.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PessoasResponse {
    @SerializedName("results")
    private List<Pessoa> pessoas;

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

}
