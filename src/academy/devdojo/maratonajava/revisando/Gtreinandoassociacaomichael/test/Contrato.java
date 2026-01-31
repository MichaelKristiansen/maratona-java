package academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.test;

import academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.dominio.Assinatura;
import academy.devdojo.maratonajava.treinamentomark.Gtreinandoassociacaomichael.dominio.Cliente;

public class Contrato {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Joao", "111.112.242-81");
        Cliente cliente2 = new Cliente("Pedro", "086.142.761-42");
        Assinatura assinatura1 = new Assinatura("Netflix", 30);
        Assinatura assinatura2 = new Assinatura("Prime Video", 30);

        //pacotes de assinaturas
        Assinatura[] assinaturas1 = {assinatura1, assinatura2};
        Assinatura[] assinaturas2 = {assinatura2};
        //pacote clientes
        Cliente[] clientes1 = {cliente1, cliente2};
        Cliente[] clientes2 = {cliente2};

        //define quem pega que pacote
        cliente1.setAssinaturas(assinaturas1);
        cliente2.setAssinaturas(assinaturas2);
        assinatura1.setClientes(clientes1);
        assinatura2.setClientes(clientes2);

        cliente1.imprime();
        cliente2.imprime();
        assinatura1.imprime();
        assinatura2.imprime();
    }
}
