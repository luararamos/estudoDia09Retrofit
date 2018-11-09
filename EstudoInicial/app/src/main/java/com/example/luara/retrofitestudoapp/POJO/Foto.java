package com.example.luara.retrofitestudoapp.POJO;

import com.google.gson.annotations.SerializedName;

public class Foto {
    @SerializedName("large")
    private String fotoGrande;
    @SerializedName("medium")
    private String fotoMedia;
    @SerializedName("thumbnail")
    private String fotoPequen;

}
