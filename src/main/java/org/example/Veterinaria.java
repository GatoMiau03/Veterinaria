package org.example;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String numtel;
    private Perro perro;
    private Gato gato;


    public Veterinaria(String nombre, String direccion, String numtel){
        this.nombre = nombre;
        this.direccion = direccion;
        this.numtel = numtel;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }
    public void mostrarPacientes(){
        System.out.println("Pacientes actuales:");
        if (perro != null){
            System.out.println(perro.toString());
        }
        if (gato !=null){
            System.out.println(gato.toString());
        }
    }
    public boolean agregarPaciente(Perro perro){
        if (this.perro == null){
            this.perro = perro;
            System.out.println("Se ha agregado un paciente perruno a la veterinaria");
            return true;
        }
        else {
            System.out.println("Se exceden cupos perrunos");
        }
        return false;
    }

    public boolean agregarPaciente(Gato gato){
        if (this.gato == null){
            this.gato = gato;
            System.out.println("Se ha agregado un paciente gatuno a la veterinaria");
            return true;
        }
        else {
            System.out.println("Se exceden cupos gatunos");
        }
        return false;
    }

    public Gato getGato() {
        return gato;
    }
    public Perro getPerro(){
        return perro;
    }
}
