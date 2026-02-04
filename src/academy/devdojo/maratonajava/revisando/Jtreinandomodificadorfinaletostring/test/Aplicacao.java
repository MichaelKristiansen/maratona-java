package academy.devdojo.maratonajava.treinamentomark.Jtreinandomodificadorfinaletostring.test;

import academy.devdojo.maratonajava.treinamentomark.Jtreinandomodificadorfinaletostring.dominio.ConversaoDeMoedas;
import academy.devdojo.maratonajava.treinamentomark.Jtreinandomodificadorfinaletostring.dominio.Moeda;

public class Aplicacao {
    public static void main(String[] args) {
        Moeda moeda1 = new Moeda("Real", 1);
        Moeda moeda2 = new Moeda("Dolar", 5);

        ConversaoDeMoedas conversaoDeMoedas = new ConversaoDeMoedas(50, moeda1, moeda2);

        conversaoDeMoedas.converterMoedas();

        conversaoDeMoedas.imprime();
    }
}
