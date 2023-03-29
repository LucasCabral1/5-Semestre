package com.example.myapplication.adapter;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class AlbumHolder extends RecyclerView.ViewHolder {
    private TextView BandName;
    private TextView PhotoName;
    private TextView AnoLabel;
    private ImageView CapaAlbum;
    private Button SinopseButton;


    public AlbumHolder(@NonNull View itemView) {
        super(itemView);
        BandName = (TextView) itemView.findViewById(R.id.BandName);
        PhotoName = (TextView) itemView.findViewById(R.id.PhotoName);
        AnoLabel = (TextView) itemView.findViewById(R.id.AnoLabel);
        CapaAlbum = (ImageView) itemView.findViewById(R.id.AlbumImage);
        SinopseButton = (Button) itemView.findViewById(R.id.Sinopse);
    }

    public TextView getBandName() {
        return BandName;
    }

    public void setBandName(TextView bandName) {
        BandName = bandName;
    }

    public TextView getPhotoName() {
        return PhotoName;
    }

    public void setPhotoName(TextView photoName) {
        PhotoName = photoName;
    }

    public TextView getAnoLabel() {
        return AnoLabel;
    }

    public void setAnoLabel(TextView anoLabel) {
        AnoLabel = anoLabel;
    }

    public ImageView getCapaAlbum() {
        return CapaAlbum;
    }

    public void setCapaAlbum(ImageView capaAlbum) {
        CapaAlbum = capaAlbum;
    }

    public Button getSinopseButton() {
        return SinopseButton;
    }

    public void setSinopseButton(Button sinopseButton) {
        SinopseButton = sinopseButton;
    }
}
