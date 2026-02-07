package academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino3.test;

import academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino3.dominio.Desconto;
import academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino3.dominio.DescontosSazonais;

public class AplicacaoCalcularDesconto {
    public static void main(String[] args) {
        Desconto desconto = new Desconto("02388616271", DescontosSazonais.BLACK_FRIDAY);
        System.out.println(desconto);
        System.out.println(DescontosSazonais.BLACK_FRIDAY.calcularDesconto(1000));
        DescontosSazonais descontosSazonais = DescontosSazonais.descontoSazonalPorNomeRelatorio("Natal");
        System.out.println(descontosSazonais);
    }
}
