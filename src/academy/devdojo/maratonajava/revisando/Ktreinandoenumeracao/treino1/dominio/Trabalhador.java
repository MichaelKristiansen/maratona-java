package academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino1.dominio;

import java.util.Arrays;

public class Trabalhador {
    private String nome;
    private DiaDeTrabalho[] diasDeTrabalhos;

    public Trabalhador(String nome, DiaDeTrabalho[] diasDeTrabalhos) {
        this.nome = nome;
        this.diasDeTrabalhos = diasDeTrabalhos;
    }

    @Override
    public String toString() {
        return "Trabalhador{" +
                "nome='" + nome + '\'' +
                ", diasDeTrabalhos=" + Arrays.toString(diasDeTrabalhos) +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DiaDeTrabalho[] getDiasDeTrabalhos() {
        return diasDeTrabalhos;
    }

    public void setDiasDeTrabalhos(DiaDeTrabalho[] diasDeTrabalhos) {
        this.diasDeTrabalhos = diasDeTrabalhos;
    }
}
