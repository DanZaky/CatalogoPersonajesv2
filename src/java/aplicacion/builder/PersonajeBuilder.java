/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.builder;

/**
 *
 * @author Daniel
 */
public abstract class PersonajeBuilder {
    
    protected Personaje personaje;

    public Personaje getPersonaje() {
        return personaje;
    }

    public void crearPersonajeConcreto(){
        personaje = new Personaje();
    }

    public abstract void buildMontura();
    public abstract void buildArma();
    public abstract void buildEscudo();
    public abstract void buildCuerpo();
    
}
