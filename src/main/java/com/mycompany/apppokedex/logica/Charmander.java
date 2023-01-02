
package com.mycompany.apppokedex.logica;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Charmander y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y este es mi ataque Punio de fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y este es mi ataque Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y este es mi ataque de Ascuas");
    }
    
}
