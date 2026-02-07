package academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino2.dominio;

public enum TipoDeFrete {
    ECONOMICO{
        @Override
        public double calcularFrete(double valorPassagem){
            return valorPassagem - (valorPassagem * 0.1);
        }
    },
    PADRAO{
        @Override
        public double calcularFrete(double valorPassagem) {
            return valorPassagem;
        }
    },
    EXPRESSO{
        @Override
        public double calcularFrete(double valorPassagem) {

            return valorPassagem + (valorPassagem * 0.1);
        }
    };

    public abstract double calcularFrete(double valorPassagem);
}
