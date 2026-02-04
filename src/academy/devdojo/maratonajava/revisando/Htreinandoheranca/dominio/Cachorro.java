package academy.devdojo.maratonajava.treinamentomark.Htreinandoheranca.dominio;

import java.util.Scanner;

public class Cachorro {
    protected String raca;
    protected String tamanho;
    protected int fome;

    public Cachorro(String raca, String tamanho) {
        this.raca = raca;
        this.tamanho = tamanho;
        this.fome = 0;
    }

    public void imprime() {
        System.out.println("--- Cachorro ---");
        System.out.println("Raça: " + this.raca);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("--- Situação ---");
        if (fome >= 3) {
            System.out.println("Cachorro está com fome");
        } else {
            System.out.println("Cachorro está satisfeito");
        }
    }

    public void comer() {
        if (fome <= 0) {
            System.out.println("cachorro esta satisfeito");
            return;
        }
        fome = 0;
        System.out.println("cachorro comeu");
    }

    public void brincar() {
        if (fome >= 3) {
            System.out.println("cachorro esta com fome");
            return;
        }
        fome = 3;
        System.out.println("cachorro brincou");
    }

    public void interacao() {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("-------------------------");
            System.out.println("-------------------------");
            System.out.println("O que você quer fazer com o cachorro?");
            System.out.println("1 ver como ele está");
            System.out.println("2 brincar");
            System.out.println("3 dar comida");
            System.out.println("4 encerrar interação");
            opcao = teclado.nextInt();
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção invlida");
                return;
            }
            switch (opcao) {
                case 1:
                    imprime();
                    break;
                case 2:
                    brincar();
                    break;
                case 3:
                    comer();
                    break;
            }
        }
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
