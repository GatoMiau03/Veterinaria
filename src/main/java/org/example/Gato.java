package org.example;

public class Gato {
    private String nombre;
    private int edad;
    private String raza;
    private String genero;
    private boolean bañar;


    public Gato(String nombre, int edad, String raza, String genero, boolean bañar){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.genero = genero;
        this.bañar = bañar;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Raza: " + raza +
                ", Género: " + genero +
                ", Le gusta bañarse: " + bañar;
    }
    public String getNombre() {
        return nombre;
    }
}
