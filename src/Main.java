import controller.JogoController;
import model.Jogada;
import model.Jogador;
import view.Historico;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Historico historico = new Historico();
        /*
        * Opções de jogadas disponíveis
        * */

        Jogada pedra = new Jogada("Pedra");
        Jogada papel = new Jogada("Papel");
        Jogada tesoura = new Jogada("Tesoura");

        /*
        * Regras das jogadas disponíveis
        * */
        pedra.ganha = Arrays.asList(tesoura);
        pedra.perde = Arrays.asList(papel);

        papel.ganha = Arrays.asList(pedra);
        papel.perde = Arrays.asList(tesoura);

        tesoura.ganha = Arrays.asList(papel);
        tesoura.perde = Arrays.asList(pedra);

        Jogador um = new Jogador("Jogador 1");
        Jogador dois = new Jogador("Jogador 2");

        um.setJogada(pedra);
        dois.setJogada(pedra);

        JogoController.Jogar(um, dois, historico);

        um.setJogada(papel);
        dois.setJogada(tesoura);

        JogoController.Jogar(um, dois, historico);

        historico.mostrarHistorico();
    }

}