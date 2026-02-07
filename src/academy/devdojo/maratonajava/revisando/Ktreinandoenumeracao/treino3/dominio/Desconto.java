package academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino3.dominio;

public class Desconto {
    private String cpf;
    DescontosSazonais descontosSazonais;

    public Desconto(String cpf, DescontosSazonais descontosSazonais) {
        this.cpf = cpf;
        this.descontosSazonais = descontosSazonais;
    }

    @Override
    public String toString() {
        return "Desconto{" +
                "cpf='" + cpf + '\'' +
                ", descontosSazonais=" + descontosSazonais.nomeRelatorio +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public DescontosSazonais getDescontosSazonais() {
        return descontosSazonais;
    }

    public void setDescontosSazonais(DescontosSazonais descontosSazonais) {
        this.descontosSazonais = descontosSazonais;
    }
}
