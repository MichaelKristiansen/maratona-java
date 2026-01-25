package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        //sem valor ternario
        /*  double salario = 3000;
         *  String mensagemDoar = "Eu vou doar 500 pro DevDojo";
         *  String mensagemNaoDoar = "Eu ainda nao tenho condições!";
         *  String resultado;
         *  if(salario > 5000){
         *      resultado = mensagemDoar;
         *  }else{
         *      resultado = mensagemNaoDoar;
         *  }
         *  System.out.println(resultado);
         */

        //Doar se salario > 5000
        //com valor ternario
        double salario = 6000;
        //(condição) ? verdadeiro : falso;

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Eu ainda nao tenho condições!";

        System.out.println(resultado);
    }
}
