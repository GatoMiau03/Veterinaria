package org.example;

public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    private String genero;
    private boolean ladrar;
    private boolean jugar;
    private boolean pasear;

    public Perro(String nombre, int edad, String raza, String genero, boolean ladrar, boolean jugar, boolean pasear){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.genero = genero;
        this.ladrar = ladrar;
        this.jugar = jugar;
        this.pasear= pasear;
    }
    public void ladrar(){
        if (ladrar){
            System.out.println("Guau");
        }
        else {
            System.out.println("No esta ladrando");
        }
    }
    public void jugar(){
        if (jugar){
            System.out.println("El perro esta jugando");
        }
        else {
            System.out.println("No esta jugando");
        }
    }
    public void pasear(){
        if (pasear){
            System.out.println("El perro pasea");
        }
        else {
            System.out.println("El perro no pasea");
        }
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Edad: " + edad +
                ", Raza: " + raza +
                ", Género: " + genero +
                ", Ladra: " + ladrar +
                ", Juega: " + jugar +
                ", Le gusta salir a pasear: " + pasear;
    }
}
