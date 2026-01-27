package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    //Ultilizando switch e dado os valores de 1 a 7 imprima se é dia util ou final de semana
    //Considerando 1 como domingo
    public static void main(String[] args) {
        /*minha resolução
        byte dia = 10;
        String tipoDia = "neutro";
        String diaUtil = "Dia util";
        String finalDeSemana = "Final de Semana";
        switch(dia){
            case 1:
                tipoDia = finalDeSemana;
                break;
            case 2:
                tipoDia = diaUtil;
                break;
            case 3:
                tipoDia = diaUtil;
                break;
            case 4:
                tipoDia = diaUtil;
                break;
            case 5:
                tipoDia = diaUtil;
                break;
            case 6:
                tipoDia = diaUtil;
                break;
            case 7:
                tipoDia = finalDeSemana;
                break;
            default:
                tipoDia = "Opção Inválida";
                break;
        }
        System.out.println(tipoDia);
         */
        //resoluçãodo professor
        byte dia = 5;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
        }
        //informação comentarios
        /*
             A partir do Java 14 a gente tem o switch expression, segue como ficaria a resolução do exercicio:

                switch (dia) {
                    case 1, 7 -> System.out.println("Fim de semana");
                    case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
                    default -> throw new IllegalArgumentException("Unexpected value: " + dia);
                }
         */
    }
}
