package academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino3.dominio;

public enum DescontosSazonais {
    BLACK_FRIDAY (1, "Black Friday") {
        @Override
        public double calcularDesconto(double valorCompra) {
            return valorCompra * 0.3;
        }
    },
    DIA_DAS_MAES (2, "Dia das mães"){
        @Override
        public double calcularDesconto(double valorCompra) {
            return valorCompra * 0.1;
        }
    },
    NATAL (3, "Natal"){
        @Override
        public double calcularDesconto(double valorCompra) {
            return valorCompra * 0.2;
        }
    },
    NENHUM (4, "Nenhum"){
        @Override
        public double calcularDesconto(double valorCompra) {
            return 0;
        }
    };

    public final int id;
    public final String nomeRelatorio;

    DescontosSazonais(int id, String nomeRelatorio) {
        this.id = id;
        this.nomeRelatorio = nomeRelatorio;
    }

    public abstract double calcularDesconto(double valorCompra);

    public static DescontosSazonais descontoSazonalPorNomeRelatorio(String nomeRelatorio){
        for (DescontosSazonais descontosSazonais : values()) {
            if ( descontosSazonais.getNomeRelatorio().equals(nomeRelatorio) ){
                return descontosSazonais;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
