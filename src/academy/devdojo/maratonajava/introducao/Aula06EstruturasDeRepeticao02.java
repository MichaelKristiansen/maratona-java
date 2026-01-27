package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares ate 1.000.000
        for(int i = 2; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
