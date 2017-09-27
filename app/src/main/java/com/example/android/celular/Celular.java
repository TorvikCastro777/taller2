package com.example.android.celular;

/**
 * Created by android on 26/09/2017.
 */

public class Celular {
    private String celular;
    private String ram;
    private String color;

    public Celular(String celular, String ram, String color) {
        this.celular = celular;
        this.ram = ram;
        this.color = color;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
