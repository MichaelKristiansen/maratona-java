package academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.test;

import academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.dominio.Aluno;
import academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.dominio.Local;
import academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.dominio.Professor;
import academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.dominio.Seminario;

public class GerenciamentoSeminario {
    public static void main(String[] args) {
        Local local1 = new Local("Estacio - Bloco E");
        Local local2 = new Local("Estacio - Bloco A");

        Seminario seminario1 = new Seminario("Beneficios da Oratoria", local1);
        Seminario seminario2 = new Seminario("Desafios da Saúde Publica", local2);

        Aluno aluno1 = new Aluno("Rafael", 15);
        Aluno aluno2 = new Aluno("Angelo", 14);

        Professor professor1 = new Professor("Ednaldo", "Língua Portuguesa");
        Professor professor2 = new Professor("Aderbaldo", "Sociologia");

        Aluno[] alunos1 = {aluno1, aluno2};
        Professor[] professores1 = {professor1, professor2};
        Professor[] professores2 = {professor2};

        seminario1.setAlunos(alunos1);
        seminario1.setProfessores(professores1);

//        seminario2.setAlunos(alunos1);
        seminario2.setProfessores(professores2);

        seminario1.imprime();
        seminario2.imprime();
    }
}
