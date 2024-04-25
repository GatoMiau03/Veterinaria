package org.example;

public class Main {
    public static void main(String[] args){
        Perro perro1 = new Perro ("Max",5,"Pastor","M",true,true,true);
        Gato gato1 = new Gato("Dipper",1,"Pelo corto","M", true,true,true,false);
        Veterinaria veterinaria = new Veterinaria("Vet","Ufro","123");

        veterinaria.agregarPaciente(perro1);
        veterinaria.agregarPaciente(gato1);
        veterinaria.agregarPaciente(new Perro("ola",5,"a","m",true,true,true));

    }
}
