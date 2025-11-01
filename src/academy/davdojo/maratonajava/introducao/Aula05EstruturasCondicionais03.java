package academy.davdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        /**
         *  Operador ternário (condição) ? verdadeiro : falso
         *  o tipo do resultado tem que bater exatamente com o tipo da variável definida
         */

        double salario = 6000.0;
        String mensagemDoar = salario >= 6000 ? "Eu doarei 500 reais para o DevDojo" : "Eu não posso doar ainda esse valor";

        System.out.println(mensagemDoar);
    }
}
