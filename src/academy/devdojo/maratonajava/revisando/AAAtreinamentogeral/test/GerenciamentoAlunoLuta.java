package academy.devdojo.maratonajava.treinamentomark.AAAtreinamentogeral.test;

import academy.devdojo.maratonajava.treinamentomark.AAAtreinamentogeral.dominio.Aluno;
import academy.devdojo.maratonajava.treinamentomark.AAAtreinamentogeral.dominio.Luta;
import academy.devdojo.maratonajava.treinamentomark.AAAtreinamentogeral.dominio.MatricularAluno;

public class GerenciamentoAlunoLuta {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("José", "123.456.789-10");
        MatricularAluno matricularAluno = new MatricularAluno(aluno1, Luta.JUDO);
        System.out.println(matricularAluno);
        matricularAluno.imprimirDadosMatricula();
    }
}
