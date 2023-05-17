/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public abstract class Guerreiro {
    private String nome;
    private int pontosVida;
    private int pontosAtaque;

    public Guerreiro() {
    }

    public Guerreiro(String nome, int pontosVida, int pontosAtaque) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.pontosAtaque = pontosAtaque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getPontosAtaque() {
        return pontosAtaque;
    }

    public void setPontosAtaque(int pontosAtaque) {
        this.pontosAtaque = pontosAtaque;
    }

    @Override
    public String toString() {
        return "Guerreiro{" + "nome=" + nome + ", pontosVida=" + pontosVida + ", pontosAtaque=" + pontosAtaque + '}';
    }
    

}
