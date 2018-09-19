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
public class Elfo extends PersonajeBuilder{
    
    @Override
    public void buildMontura() {
        
        Montura montura = new Montura();
        montura.setTipo_montura("img/MonturaElfo.png");
        personaje.setMontura(montura);
        
    }

    @Override
    public void buildArma() {
        
        Arma arma = new Arma();
        arma.setTipo_arma("img/ArmaElfo.png");
        personaje.setArma(arma);
        
    }

    @Override
    public void buildEscudo() {
        
        Escudo escudo = new Escudo();
        escudo.setTipo_escudo("img/EscudoElfo.png");
        personaje.setEscudo(escudo);
        
    }
    
    @Override
    public void buildCuerpo() {

        Cuerpo cuerpo = new Cuerpo();
        cuerpo.setTipo_cuerpo("img/CuerpoElfo.png");
        personaje.setCuerpo(cuerpo);
        
    }
    
}
