package com.example.myapplication.dataset;

import com.example.myapplication.R;
import com.example.myapplication.model.Album;

import java.util.ArrayList;
import java.util.List;

public class AlbumDataSet {
    private static List<Album> lista;

    public static List<Album>  getLista(){
        lista = new ArrayList<>();
        lista.add(new Album("Matanza",2019,"Matanza Cronicas do pós mortem", "Renan Soares", R.mipmap.matanza));
        lista.add(new Album("Xuxa",2000,"Xuxa só para baixinhos", "Sasha Xuxa", R.mipmap.xuxa));
        lista.add(new Album("Velhas Virgens",2009,"Ninguém beija como as lésbicas", "Paulão do Gás", R.mipmap.vv));
        return lista;
    }

}
