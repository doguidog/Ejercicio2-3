package com.example.ejercicio2_3.Operacion;

public class Fotos {

    private int id;
    private String descripcion;
    private byte[] foto;

    public Fotos() {

    }

    public Fotos(int id, String descripcion, byte[] foto) {
        this.id = id;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
