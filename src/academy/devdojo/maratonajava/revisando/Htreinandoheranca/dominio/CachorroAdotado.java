package academy.devdojo.maratonajava.treinamentomark.Htreinandoheranca.dominio;

public class CachorroAdotado extends CachorroDeRua {
    protected String nome;

    public CachorroAdotado(String raca, String tamanho, boolean doenca, String nome) {
        super(raca, tamanho, doenca);
        this.nome = nome;
    }

    @Override
    public void imprime() {
        System.out.println("--- Adoção ---");
        System.out.println("Nome: " + this.nome);
        super.imprime();
        System.out.println("Declaração de Posse de Cachorro:");
        if (doenca == true) {
            System.out.println("O ex cachorro de rua " + this.nome + " de tamanho " + this.tamanho + " tem doença");
            return;
        }
        System.out.println("O ex cachorro de rua " + this.nome + " de tamanho " + this.tamanho + " nao tem doença");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
