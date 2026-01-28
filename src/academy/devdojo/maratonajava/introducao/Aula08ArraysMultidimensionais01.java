package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 01,02,03,04,05 Meses
        // 31,28,31,30,31 dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 32;
        dias[1][1] = 29;
        dias[1][2] = 32;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-----------------------------");

        for(int[] arraBase: dias){
            for(int num: arraBase){
                System.out.println(num);
            }
        }

    }
}
