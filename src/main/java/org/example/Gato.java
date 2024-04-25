package org.example;

public class Gato {
    private String nombre;
    private int edad;
    private String raza;
    private String genero;
    private boolean maulla;
    private boolean mira_Con_Desprecio;
    private boolean ronronea;
    private boolean bañar;


    public Gato(String nombre, int edad, String raza, String genero, boolean maulla, boolean mira_Con_Desprecio, boolean ronronea, boolean bañar){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.genero = genero;
        this.maulla = maulla;
        this.mira_Con_Desprecio = mira_Con_Desprecio;
        this.ronronea = ronronea;
        this.bañar = bañar;
    }
    public void maulla(){
        if (maulla){
            System.out.println("Miau");
        }
        else {
            System.out.println("El gato no maullo");
        }
    }
    public void Mira_Con_Desprecio(){
        if (mira_Con_Desprecio){
            System.out.println("Te mira con desprecio");
        }
        else {
            System.out.println("No te mira con desprecio");
        }
    }
    public void ronronea(){
        if (ronronea){
            System.out.println("Prrr");
        }
        else {
            System.out.println("No ronronea");
        }
    }

}
