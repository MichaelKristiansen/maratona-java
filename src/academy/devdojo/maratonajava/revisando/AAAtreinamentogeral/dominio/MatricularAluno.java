package academy.devdojo.maratonajava.treinamentomark.AAAtreinamentogeral.dominio;

public class MatricularAluno {
    private Aluno aluno;
    private Luta luta;

    public MatricularAluno(Aluno aluno, Luta luta) {
        this.aluno = aluno;
        this.luta = luta;
    }

    public void imprimirDadosMatricula(){
        System.out.println("--- Informações Precisas Matriculas ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Luta matriculado: " + getLuta());
    }

    @Override
    public String toString() {
        System.out.println("-- Informações Basicas Aluno ---");
        return "MatricularAluno{" +
                "aluno=" + aluno.getNome() +
                ", luta=" + luta +
                '}';
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Luta getLuta() {
        return luta;
    }

    public void setLuta(Luta luta) {
        this.luta = luta;
    }
}
