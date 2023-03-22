package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.dataset.PessoaDataSet;
import com.example.myapplication.model.Pessoa;

import java.util.List;


public class PessoaAdapter  extends RecyclerView.Adapter<PessoaHolder> {
    private List<Pessoa> pessoas;

    public PessoaAdapter(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @NonNull
    @Override
    public PessoaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PessoaHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_item_pessoa, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PessoaHolder holder, int position) {
        Pessoa pessoa = pessoas.get(position);
        holder.getTextNome().setText(pessoa.getCodigo() + " - " + pessoa.getNome());
        holder.getBtnExcluir().setOnClickListener(x -> RemoverItem(position));
    }

    public void RemoverItem(int position){
        pessoas.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, pessoas.size());
    }

    public void adicionarItem(Pessoa pessoa){
        PessoaDataSet.AddPessoa(pessoa);
        notifyItemInserted(getItemCount());
    }

    @Override
    public int getItemCount() {
        return pessoas == null ? 0 : pessoas.size();
    }
}
