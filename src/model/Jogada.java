package model;

import java.util.List;

public class Jogada {

    public String nome;
    public List<Jogada> ganha;
    public List<Jogada> perde;

    public Jogada(String nome) {
        this.nome = nome;
    }

    public Jogada(String nome, List<Jogada> ganha, List<Jogada> perde) {
        this.nome = nome;
        this.ganha = ganha;
        this.perde = perde;
    }

}
