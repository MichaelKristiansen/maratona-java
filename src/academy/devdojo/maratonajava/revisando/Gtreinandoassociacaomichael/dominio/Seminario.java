package academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor[] professores;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprime(){
        System.out.println("--- Seminario ---");
        System.out.print("Titulo: ");
        System.out.println(this.titulo);
        if (alunos != null) {
            System.out.print("Alunos no seminario: | ");
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNome() + " " + aluno.getIdade() + " Anos | ");
            }
            System.out.println();
        }
        if(professores != null) {
            System.out.println("Professores no seminario: ");
            for (Professor professor : professores) {
                System.out.println(professor.getNome() + " - " + professor.getEspecialidade());
            }
        }
        System.out.print("Local: ");
        System.out.println(local.getEndereco());
        System.out.println("--------------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
