package academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.dominio;

public class Assinatura {
    private String nome;
    private int valor;
    private Cliente[] clientes;

    public Assinatura(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void imprime(){
        System.out.println("--- Assinatura ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + this.valor);
        System.out.println("Clientes da empresa: ");
        if (clientes == null) return;
        for(Cliente client : clientes){
            System.out.println(client.getNome());
        }
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
