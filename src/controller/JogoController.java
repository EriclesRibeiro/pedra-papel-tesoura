package controller;

import model.Jogada;
import model.Jogador;

public class JogoController {

    public static void Jogar(Jogador jogador1, Jogador jogador2) {

        Jogada jogada1 = jogador1.getJogada();
        Jogada jogada2 = jogador2.getJogada();

        if (jogada1.ganha.contains(jogada2)) {
            System.out.println("O(A) jogador(a) " + jogador1.getNome() + " ganhou da(a) jogador(a) " + jogador2.getNome() + "!");
        } else if (jogada1.perde.contains(jogada2)) {
            System.out.println("O(A) jogador(a) " + jogador2.getNome() + " ganhou do(a) jogador(a)" + jogador1.getNome() + "!");
        } else {
            System.out.println("Os(As) jogadores(as) " + jogador1.getNome() + " e " + jogador2.getNome() + " empataram!");
        }

    }

}
