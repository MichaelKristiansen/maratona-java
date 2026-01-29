package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public double mediaSalario() {
        if (salario == null) {
            return 0;
        }
        for (double num : salario) {
            media += num;
        }
        media /= salario.length;
        return media;
    }

    public void imprimirDados() {
        System.out.println("--------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salario == null) {
            return;
        }
        int i = 1;
        for (double num : salario) {
            System.out.print(i++ + "° salario: " + num + " ");
        }
        double media = mediaSalario();
        System.out.println("\nMedia Salarial: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}