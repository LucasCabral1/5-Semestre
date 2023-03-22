package com.example.myapplication.dataset;

import com.example.myapplication.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaDataSet {
    private static List<Pessoa> list;
    public static List<Pessoa> getLista(){
        list = new ArrayList<>();
        list.add(new Pessoa("Rafael Moreno", 1));
        list.add(new Pessoa("Luiz Moreno", 2));
        list.add(new Pessoa("Renato Moreno", 3));
        list.add(new Pessoa("José Moreno", 4));
        return list;
    }

    public static void AddPessoa(Pessoa pessoa){
        list.add(pessoa);
    }
}
