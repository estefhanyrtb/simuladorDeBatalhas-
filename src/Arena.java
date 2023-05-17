/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Arena {
    public Guerreiro batalhar(Guerreiro g1, Guerreiro g2){
        if(g1.getPontosVida()>g2.getPontosVida()){
            return g1;
        }
        if(g2.getPontosVida()>g1.getPontosVida()){
            return g2;
        }
        return null;
    }
}
