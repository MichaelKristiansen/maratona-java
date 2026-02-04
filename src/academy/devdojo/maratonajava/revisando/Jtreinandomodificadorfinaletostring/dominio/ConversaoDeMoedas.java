package academy.devdojo.maratonajava.treinamentomark.Jtreinandomodificadorfinaletostring.dominio;

public class ConversaoDeMoedas {
    private final double TAXA_DE_CAMBIO = 0.10;
    private static double ContadorDeConversoes = 0;
    private double quantia;
    private Moeda moeda;
    private Moeda moeda2;

    {
        System.out.println("Conversor real para dolar");
    }

    public ConversaoDeMoedas(double quantia, Moeda moeda, Moeda moeda2) {
        this.quantia = quantia;
        this.moeda = moeda;
        this.moeda2 = moeda2;
    }

    public void converterMoedas() {
        quantia = (quantia * (moeda.getPreco() / moeda2.getPreco())) - TAXA_DE_CAMBIO;
        ConversaoDeMoedas.ContadorDeConversoes += 1;
    }

    public void imprime() {
        System.out.println("Voce converteu " + moeda.getNome() + " para " + moeda2.getNome());
        System.out.println("Sua quantia em dolar é: U$" + quantia);
    }

    public double getTAXA_DE_CAMBIO() {
        return TAXA_DE_CAMBIO;
    }

    public static double getContadorDeConversoes() {
        return ContadorDeConversoes;
    }

    public static void setContadorDeConversoes(double contadorDeConversoes) {
        ContadorDeConversoes = contadorDeConversoes;
    }
}
