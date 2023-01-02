
package com.mycompany.apppokedex.logica;


public abstract class Pokemon {
    
    //Se Agrega protected para que solo las hijos tengan acceso
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected int temporada;
    
    //Metodos abstractos
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
    
    
    
}
