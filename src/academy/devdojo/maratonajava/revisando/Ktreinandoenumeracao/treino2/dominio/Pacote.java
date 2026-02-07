package academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino2.dominio;

public class Pacote {
    private int id;
    StatusEntrega statusEntrega;
    TipoDeFrete tipoDeFrete;

    public Pacote(int id, StatusEntrega statusEntrega, TipoDeFrete tipoDeFrete) {
        this.id = id;
        this.statusEntrega = statusEntrega;
        this.tipoDeFrete = tipoDeFrete;
    }

    @Override
    public String toString() {
        return "Pacote{" +
                "id=" + id +
                ", statusEntrega=" + statusEntrega.nomeRelatorio +
                ", tipoDeFrete=" + tipoDeFrete +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatusEntrega getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(StatusEntrega statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public TipoDeFrete getTipoDeFrete() {
        return tipoDeFrete;
    }

    public void setTipoDeFrete(TipoDeFrete tipoDeFrete) {
        this.tipoDeFrete = tipoDeFrete;
    }
}
