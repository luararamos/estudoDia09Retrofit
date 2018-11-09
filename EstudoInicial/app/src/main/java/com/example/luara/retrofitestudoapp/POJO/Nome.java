package com.example.luara.retrofitestudoapp.POJO;

import com.google.gson.annotations.SerializedName;

public class Nome {
        @SerializedName("title")
        private String titulo;
        @SerializedName("first")
        private String primeiroNome;
        @SerializedName("last")
        private String segundoNome;
}
