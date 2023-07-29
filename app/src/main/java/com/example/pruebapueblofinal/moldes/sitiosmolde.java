package com.example.pruebapueblofinal.moldes;

public class sitiosmolde {

     private  String nombre;
     private String telefono;
    private String precio;
     private int imagen;

    public sitiosmolde() {
    }

    public sitiosmolde(String nombre, String telefono, String precio, int imagen) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precio = precio;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}






