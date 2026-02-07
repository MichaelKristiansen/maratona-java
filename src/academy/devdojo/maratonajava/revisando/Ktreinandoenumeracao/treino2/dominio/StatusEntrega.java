package academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino2.dominio;

public enum StatusEntrega {
    PROCESSAMENTO (1, "Processamento"),
    SAIU_PARA_ENTREGA(2, "Saiu Para Entrega"),
    CONCLUSAO(3, "Conclusão"),
    PROBLEMAS_OU_DEVOLUCOES(4, "Problemas ou Devoluções");

    public final int idStatusEntrega;
    public final String nomeRelatorio;

    StatusEntrega(int idStatusEntrega, String nomeRelatorio) {
        this.idStatusEntrega = idStatusEntrega;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static StatusEntrega statusEntregaPorNomeRelatorio(String nomeRelatorio){
        for(StatusEntrega statusEntrega : values()){
            if(statusEntrega.getNomeRelatorio().equals(nomeRelatorio)) {
                return statusEntrega;
            }
        }
        return null;
    }

    public int getIdStatusEntrega() {
        return idStatusEntrega;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
