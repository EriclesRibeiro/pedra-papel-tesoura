package view;

import model.Resultado;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Resultado> resultados = new ArrayList<>();

    public Historico() {}

    public void adicionar(Resultado resultado) {
        resultados.add(resultado);
    }

    public void mostrarHistorico() {
        resultados.forEach(resultado -> System.out.println(resultado.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + " - " + resultado.mensagem));
    }
}
