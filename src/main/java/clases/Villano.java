package clases;

import org.example.Heroe;

public class Villano {

    protected String nombre;
    int poder;
    Heroe heroe;

    public int destruir(){
        int resultado=this.poder-this.heroe.getPoder();
        return resultado;

    }
}
