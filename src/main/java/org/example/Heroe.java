package org.example;

public class Heroe {

    //atributos
    private String nombre;
    private int poder=900; //0-100

    //métodos especiales
    //constructores

    //constructor vacio
    public Heroe() {
    }
    // constructor lleno
    public Heroe(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    // métodos especiales para modificadores de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    // para que el set funcione debe tener un condicional
    public void setPoder(int poder) {
        if (poder>=0 && poder>=100){
            this.poder=poder;
        }else{
            System.out.println("poder incorrecto");
        }
    }

    public String saludar(String nombre){
       return"te vencere"+nombre;
    }

}

