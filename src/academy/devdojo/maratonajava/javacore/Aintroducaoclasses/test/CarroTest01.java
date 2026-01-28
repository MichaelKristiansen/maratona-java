package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carrox = new Carro();

        carro1.nome = "Ferrari";
        carro1.modelo = "SUPRA";
        carro1.ano = 1940;

        carro2.nome = "Audi";
        carro2.modelo = "R8";
        carro2.ano = 2016;

        carrox = carro1;
        carro1 = carro2;

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);

        System.out.println("\nCarro x (backup carro1)");
        System.out.println("Nome: " + carrox.nome);
        System.out.println("Modelo: " + carrox.modelo);
        System.out.println("Ano: " + carrox.ano);
    }
}
