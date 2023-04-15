package com.alexandrestefani.recyclerview_java.Activity.Model;

public class Filmes {
    private String filme;
    private String ano;
    private String genero;
    private int imageMovie;


    public Filmes(String filme, String ano, String genero, int imageMovie) {
        this.filme = filme;
        this.ano = ano;
        this.genero = genero;
        this.imageMovie = imageMovie;
    }

    public int getImageMovie() {
        return imageMovie;
    }

    public void setImageMovie(int imageMovie) {
        this.imageMovie = imageMovie;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
