package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{6,7,8,9,10};

//        for (int i = 0; i < numeros3.length; i++) {
//            System.out.println(numeros3[i]);
//        }

        for(int i:numeros3){
            System.out.println(i);
        }
//        isso que acontece nesse novo for
//        int num = numeros3[0];
//        System.out.println(num);
//        int num = numeros3[1];
//        System.out.println(num);
//        int num = numeros3[2];
//        System.out.println(num);
    }
}
