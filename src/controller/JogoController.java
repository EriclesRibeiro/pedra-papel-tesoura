package controller;

import model.Jogada;
import model.Jogador;
import model.Resultado;
import view.Historico;

public class JogoController {

    public static void Jogar(Jogador jogador1, Jogador jogador2, Historico historico) {

        Jogada jogada1 = jogador1.getJogada();
        Jogada jogada2 = jogador2.getJogada();

        if (jogada1.ganha.contains(jogada2)) {

            Resultado resultado = new Resultado("O(A) jogador(a) " + jogador1.getNome() + " ganhou da(a) jogador(a) " + jogador2.getNome() + "!");
            historico.adicionar(resultado);

        } else if (jogada1.perde.contains(jogada2)) {

            Resultado resultado = new Resultado("O(A) jogador(a) " + jogador2.getNome() + " ganhou do(a) jogador(a)" + jogador1.getNome() + "!");
            historico.adicionar(resultado);

        } else {

            Resultado resultado = new Resultado("Os(As) jogadores(as) " + jogador1.getNome() + " e " + jogador2.getNome() + " empataram!");
            historico.adicionar(resultado);

        }

    }

}
