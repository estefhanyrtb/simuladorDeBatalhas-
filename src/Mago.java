/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Mago extends Guerreiro {

    public Mago(String nome, int pontosVida, int pontosAtaque) {
        super(nome, pontosVida, pontosAtaque);
    }

    public Guerreiro atacar(Guerreiro alvo) {
        alvo.setPontosVida(alvo.getPontosVida() - 5);
        return alvo;
    }

    public int defender(int pontos) {
        return this.getPontosVida() - pontos;
    }
}
