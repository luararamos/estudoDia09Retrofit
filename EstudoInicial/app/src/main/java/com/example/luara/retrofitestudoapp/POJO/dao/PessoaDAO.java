package com.example.luara.retrofitestudoapp.POJO.dao;

import com.example.luara.retrofitestudoapp.POJO.Pessoa;
import com.example.luara.retrofitestudoapp.POJO.PessoasResponse;
import com.example.luara.retrofitestudoapp.service.RetrofitService;
import com.example.luara.retrofitestudoapp.service.ServiceListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PessoaDAO {

    public void getUserDao(final ServiceListener listener){
        //Prepara a chamada para a API
        Call<PessoasResponse> call = RetrofitService.getApiService().getPessoa();
        // Coloca a chamada na fila
        call.enqueue(new Callback<PessoasResponse>() {
            @Override
            public void onResponse(Call<PessoasResponse> call, Response<PessoasResponse> response) {
                if (response.body() != null){
                    listener.onSuccess(response.body());
                }

            }

            @Override
            public void onFailure(Call<PessoasResponse> call, Throwable t) {

                listener.onError(t);
            }
        });
    }

}
