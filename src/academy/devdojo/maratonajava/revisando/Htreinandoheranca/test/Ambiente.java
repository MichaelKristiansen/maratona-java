package academy.devdojo.maratonajava.treinamentomark.Htreinandoheranca.test;

import academy.devdojo.maratonajava.treinamentomark.Htreinandoheranca.dominio.Cachorro;
import academy.devdojo.maratonajava.treinamentomark.Htreinandoheranca.dominio.CachorroAdotado;
import academy.devdojo.maratonajava.treinamentomark.Htreinandoheranca.dominio.CachorroDeRua;

public class Ambiente {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("vira-lata", "medio");
        CachorroDeRua cachorroDeRua1 = new CachorroDeRua("buldog", "pequeno", false);
        CachorroAdotado cachorroAdotado1 = new CachorroAdotado("Pastor Alemão", "Grande", false, "Pega raio");

//        cachorro1.interacao();
//        cachorroDeRua1.interacao();
        cachorroAdotado1.interacao();
    }
}
