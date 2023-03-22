package com.example.myapplication.adapter;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import org.w3c.dom.Text;

public class PessoaHolder extends RecyclerView.ViewHolder {

    private TextView textNome;
    private ImageButton btnExcluir;
    public PessoaHolder(@NonNull View itemView) {
        super(itemView);
        textNome = (TextView) itemView.findViewById(R.id.txtNome);
        btnExcluir = (ImageButton) itemView.findViewById(R.id.btnExcluir);
    }

    public TextView getTextNome() {
        return textNome;
    }

    public ImageButton getBtnExcluir() {
        return btnExcluir;
    }
}
