/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class Main {

    public static void main(String[] args) {
        Guerreiro eduardo = new Mago("eduardo", 10, 8);
        Guerreiro luan = new GuerreiroFisico("luan", 20, 7);
        Guerreiro luiza = new Arqueiro("luiza", 30, 9);
        Arena arena = new Arena();
        Guerreiro ganhador = arena.batalhar(luan, eduardo);
        System.out.println(ganhador);
        Guerreiro ganhador2 = arena.batalhar(luiza, eduardo);
        System.out.println(ganhador2);
    }
    }
