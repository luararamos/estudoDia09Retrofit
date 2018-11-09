package com.example.luara.retrofitestudoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.luara.retrofitestudoapp.POJO.Pessoa;
import com.example.luara.retrofitestudoapp.POJO.PessoasResponse;
import com.example.luara.retrofitestudoapp.POJO.dao.PessoaDAO;
import com.example.luara.retrofitestudoapp.service.ServiceListener;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ServiceListener {
    private TextView textView;
    private Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.nome);

        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.getUserDao(this);



    }

    @Override
    public void onSuccess(Object object) {
//        pessoas = ( Pessoa) object;
        PessoasResponse pessoasResponse = (PessoasResponse) object;
        pessoa = pessoasResponse.getPessoas().get(0);
        textView.setText(pessoa.getEmail());
//        Retorno retorno = (Retorno)o;
//        user = retorno.getUsers().get(0);
//        textView.setText(user.getEmail());
//        swipeRefreshLayout.setRefreshing(false);


    }

    @Override
    public void onError(Throwable throwable) {
                //getContext pq era activity?
                //Toast.makeText(getContext(), "Error: " + throwable.getMessage(),
                //Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Error: " + throwable.getMessage(),
        Toast.LENGTH_SHORT).show();


    }
}
