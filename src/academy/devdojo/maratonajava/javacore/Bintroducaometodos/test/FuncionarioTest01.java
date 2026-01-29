package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Carlinhos");
        funcionario.setIdade(34);
        funcionario.setSalario(new double[] {1000, 2300, 1500});

        funcionario.imprimirDados();
    }
}
