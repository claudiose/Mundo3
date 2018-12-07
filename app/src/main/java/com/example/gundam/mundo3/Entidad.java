package com.example.gundam.mundo3;

public class Entidad {

//representa a cada clase

    private int imgFoto;
    String titulo;
    String contenido;

    //constructor

    public Entidad (int imgFoto, String titulo, String contenido){
        this.imgFoto = imgFoto;
        this.titulo = titulo;
        this.contenido = contenido;

    }

    //metodos get para cada atributo

    public int getImgFoto() {
        return imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
}
