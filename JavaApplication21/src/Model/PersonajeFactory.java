/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Equipamento.*;

/**
 *
 * @author estudiantes
 */
public abstract class PersonajeFactory {
    Arma arma;
    Caballeria caballeria;
    Escudo escudo;

    public Arma getArma() {
        return arma;
    }


    public Caballeria getCaballeria() {
        return caballeria;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    
}
