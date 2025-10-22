package model;

import java.time.LocalDateTime;
import java.util.Date;

public class Resultado {

    public String mensagem;
    public LocalDateTime data;

    public Resultado(String mensagem) {
        this.mensagem = mensagem;
        this.data = LocalDateTime.now();
    }

    public Resultado(String mensagem, LocalDateTime data) {
        this.mensagem = mensagem;
        this.data = data;
    }
}
