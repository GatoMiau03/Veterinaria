package org.example;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String numtel;
    private List<Perro> perros;
    private List<Gato> gatos;
    public Veterinaria(String nombre, String direccion, String numtel){
        this.nombre = nombre;
        this.direccion = direccion;
        this.numtel = numtel;
        this.perros = new ArrayList<>();
        this.gatos = new ArrayList<>();
    }
    public void mostrarPacientes() {
        System.out.println("Pacientes actuales:");
        for (Perro perro : perros) {
            System.out.println(perro.toString());
        }
        for (Gato gato : gatos) {
            System.out.println(gato.toString());
        }
    }
    public boolean darDeAlta(String nombre) {
        for (Perro perro : perros) {
            if (perro.getNombre().equals(nombre)) {
                perros.remove(perro);
                return true;
            }
        }

        for (Gato gato : gatos) {
            if (gato.getNombre().equals(nombre)) {
                gatos.remove(gato);
                return true;
            }
        }

        return false;
    }
    public boolean agregarPaciente(Perro perro) {
        if (this.perros.size() < 1) {
            this.perros.add(perro);
            System.out.println("Se ha agregado un paciente perruno a la veterinaria");
            return true;
        } else {
            System.out.println("Se exceden cupos perrunos");
        }
        return false;
    }

    public boolean agregarPaciente(Gato gato) {
        if (this.gatos.size() < 1) {
            this.gatos.add(gato);
            System.out.println("Se ha agregado un paciente gatuno a la veterinaria");
            return true;
        } else {
            System.out.println("Se exceden cupos gatunos");
        }
        return false;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public List<Gato> getGatos() {
        return gatos;
    }
}
