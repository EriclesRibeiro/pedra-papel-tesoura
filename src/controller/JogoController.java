package controller;

import model.Jogada;
import model.Jogador;

public class JogoController {

    public static void Jogar(Jogador jogador1, Jogador jogador2) {

        Jogada jogada1 = jogador1.getJogada();
        Jogada jogada2 = jogador2.getJogada();

        if (jogada1.ganha.contains(jogada2)) {
            System.out.println("Jogador 1 ganhou");
        } else if (jogada1.perde.contains(jogada2)) {
            System.out.println("Jogador 2 ganhou");
        } else {
            System.out.println("Empatou");
        }

    }

}
