package com.josedlpozo.backendless;

/**
 * Created by josedelpozo on 16/4/16.
 */
public class Amigo {

    private String nombre;
    private String telefono;
    private String cumple;

    public Amigo(String nombre, String telefono, String cumple) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cumple = cumple;
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

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }
}
