package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Album;

import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumHolder> {

    private List<Album> albums;
    private Context context;
    public AlbumAdapter (List<Album>albuns, Context Context){
        this.albums = albuns;
        this.context = Context;
    }

    @NonNull
    @Override
    public AlbumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AlbumHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_album,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumHolder holder, int position) {
        Album album = albums.get(position);
        holder.getBandName().setText(album.getBanda());
        holder.getPhotoName().setText(album.getFotografo());
        holder.getAnoLabel().setText(String.valueOf(album.getAno()));
        holder.getSinopseButton().setOnClickListener(view -> ShowSinopse (album.getSaibaMais()));
        holder.getCapaAlbum().setImageResource(album.getCapa());

    }

    private void ShowSinopse(String SaibaMais) {
        Toast.makeText(this.context, SaibaMais, Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }
}
