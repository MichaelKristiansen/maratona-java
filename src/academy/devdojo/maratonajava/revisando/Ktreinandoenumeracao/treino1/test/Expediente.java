package academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino1.test;

import academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino1.dominio.DiaDeTrabalho;
import academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino1.dominio.Trabalhador;

import static academy.devdojo.maratonajava.treinamentomark.Ktreinandoenumeracao.treino1.dominio.DiaDeTrabalho.*;

public class Expediente {
    public static void main(String[] args) {
        DiaDeTrabalho[] expedienteNormal = {SEG, TER, QUA, QUI, SEX};
        DiaDeTrabalho[] expedienteEscravo = {DOM, SEG, TER, QUA, QUI, SEX, SAB};
        DiaDeTrabalho[] desempregado = {};

        Trabalhador trabalhador1 = new Trabalhador("Vinicius", expedienteEscravo);
        Trabalhador trabalhador2 = new Trabalhador("Vitor", expedienteNormal);
        Trabalhador trabalhador3 = new Trabalhador("Michael", desempregado);

        System.out.println(trabalhador1);
        System.out.println(trabalhador2);
        System.out.println(trabalhador3);
    }
}
