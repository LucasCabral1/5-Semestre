package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.adapter.PessoaAdapter;
import com.example.myapplication.dataset.PessoaDataSet;
import com.example.myapplication.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPessoa;
    private PessoaAdapter pessoaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecycler();
    }

    public void setupRecycler(){
        recyclerPessoa = (RecyclerView) findViewById(R.id.recycledPessoa);
        // definir o layout - lista vertical
        recyclerPessoa.setLayoutManager(new LinearLayoutManager(this));
        // definir adaptador
        pessoaAdapter = new PessoaAdapter(PessoaDataSet.getLista());
        recyclerPessoa.setAdapter(pessoaAdapter);
        // criar linha
        recyclerPessoa.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    public void addPessoaClick(View view){
        pessoaAdapter.adicionarItem(new Pessoa("Pessoa Teste", 7));
    }
}