/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Equipamento.Arma;
import Model.Equipamento.HumanoArma;

/**
 *
 * @author estudiantes
 */
public class Humano extends PersonajeFactory{

    @Override
    public Arma getArma() {
        return new HumanoArma();
    }

    
    
}
