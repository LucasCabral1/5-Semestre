package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.adapter.AlbumAdapter;
import com.example.myapplication.dataset.AlbumDataSet;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerAlbum;
    private AlbumAdapter albumAdapter;
    Boolean GridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpRecycler();
    }

    private void setUpRecycler() {
        recyclerAlbum = (RecyclerView)findViewById(R.id.AlbumRecycler);
        recyclerAlbum.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        GridLayout = false;
        albumAdapter = new AlbumAdapter(AlbumDataSet.getLista(), this);
        recyclerAlbum.setAdapter(albumAdapter);
        recyclerAlbum.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));
    }

    public void ChangeLayout(View view) {
        if(!GridLayout){
            recyclerAlbum.setLayoutManager(new GridLayoutManager(this,2));
            GridLayout = true;
        } else {
            recyclerAlbum.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
            GridLayout = false;
        }
    }
}