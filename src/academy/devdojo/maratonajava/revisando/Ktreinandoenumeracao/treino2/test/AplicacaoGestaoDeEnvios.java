package academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino2.test;

import academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino2.dominio.Pacote;
import academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino2.dominio.StatusEntrega;
import academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino2.dominio.TipoDeFrete;

public class AplicacaoGestaoDeEnvios {
    public static void main(String[] args) {
        Pacote pacote = new Pacote(123, StatusEntrega.PROCESSAMENTO, TipoDeFrete.ECONOMICO);
        System.out.println(TipoDeFrete.ECONOMICO.calcularFrete(1000));
        System.out.println(pacote);

        StatusEntrega statusEntrega = StatusEntrega.statusEntregaPorNomeRelatorio("Processamento");
        System.out.println(statusEntrega);
    }
}
