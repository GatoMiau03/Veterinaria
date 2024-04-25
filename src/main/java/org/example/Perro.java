package org.example;

public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    private String genero;
    private boolean jugar;
    private boolean pasear;

    public Perro(String nombre, int edad, String raza, String genero, boolean jugar, boolean pasear){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.genero = genero;
        this.jugar = jugar;
        this.pasear= pasear;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Raza: " + raza +
                ", Género: " + genero +
                ", Juega: " + jugar +
                ", Le gusta salir a pasear: " + pasear;
    }
    public String getNombre() {
        return nombre;
    }

}
