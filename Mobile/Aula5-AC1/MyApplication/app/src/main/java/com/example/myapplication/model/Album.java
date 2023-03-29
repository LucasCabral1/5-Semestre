package com.example.myapplication.model;

public class Album {
    String Banda;
    int Ano;
    String SaibaMais;
    String Fotografo;
    int Capa;

    public Album(String banda, int ano, String saibaMais, String fotografo, int capa) {
        Banda = banda;
        Ano = ano;
        SaibaMais = saibaMais;
        Fotografo = fotografo;
        Capa = capa;
    }

    public String getBanda() {
        return Banda;
    }

    public void setBanda(String banda) {
        Banda = banda;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public String getSaibaMais() {
        return SaibaMais;
    }

    public void setSaibaMais(String saibaMais) {
        SaibaMais = saibaMais;
    }

    public String getFotografo() {
        return Fotografo;
    }

    public void setFotografo(String fotografo) {
        Fotografo = fotografo;
    }

    public int getCapa() {
        return Capa;
    }

    public void setCapa(int capa) {
        Capa = capa;
    }
}
