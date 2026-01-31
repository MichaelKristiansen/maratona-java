package academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.dominio;

public class Cliente {
    private String nome;
    private String cpf;
    private Assinatura[] assinaturas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("--- Cliente ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Assinaturas do cliente:");
        if (assinaturas == null) return;
        for (Assinatura assinatura : assinaturas) {
            System.out.println(assinatura.getNome());
        }
    }

    public Assinatura[] getAssinaturas() {
        return assinaturas;
    }

    public void setAssinaturas(Assinatura[] assinaturas) {
        this.assinaturas = assinaturas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
