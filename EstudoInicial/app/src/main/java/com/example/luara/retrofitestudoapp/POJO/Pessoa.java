package com.example.luara.retrofitestudoapp.POJO;

import com.google.gson.annotations.SerializedName;

public class Pessoa {
    @SerializedName("gender")
    private String genero;
    // como pegar só o primeiro nome?
    // colocar so o first?
    @SerializedName("name")
    private Nome nome;
    private String email;
    @SerializedName("picture")
    private String foto;
    @SerializedName("phone")
    private String telefone;
    @SerializedName("cell")
    private String celular;


    public String getGenero() {
        return genero;
    }

    public Nome getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getFoto() {
        return foto;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }
}
