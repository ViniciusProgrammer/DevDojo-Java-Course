package academy.davdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long e boolean

        /**
         * Tipo int
         */
        int idade = 10;

        System.out.println("A idade é " + idade);
        System.out.printf("A idade é %d", idade);
        System.out.print("\nA idade é " + idade);

        /**
         * Tipo double
         */

        double salario = 1000.0;
        System.out.println("Salário: " + salario);

        /**
         * Tipo float
         */

        float salario2 = 1500.0F;
        System.out.println("Salário usando floar: " + salario2);

        /**
         * Tipo short
         */

        short quantidadeDeGoiabas = 10;
        System.out.println("Quantidade de goiabas" + quantidadeDeGoiabas);

        /**
         *  Tipo byte
         */
        
        byte numeroDeSapatos = 25;
        System.out.println("Quantidade de sapatos" + numeroDeSapatos);

        /**
         * Tipo long
         */

        long quantiadeDeViews = 100000L;
        System.out.println("Número de visualizações" + quantiadeDeViews);

        /**
         * Tipo boolean
         */

        boolean verdadeOuMentira = false;
        System.out.println("Verdade ou mentira" + verdadeOuMentira);

        /**
         * Tipo char
         */

        char sexo = 'M';
        System.out.println("Sexo: " + sexo);

        /**
         * Casting
         * podem ter perca de informação
         * Não é uma prática tão boa e devemos evitar
         */

        int valorInteiro = (int) 10000000000L;
        System.out.println(valorInteiro);

        float salario3 = (float) 100000.0;

        /**
         *  Tipo String sabemos que é uma classe e nem deviamos colocar nessa classe de tipos primitivos
         *  mas é algo tão comum no dia a dia que resolvemos colocar junto com os tipos primitivos aqui
         */

        String frase = "Aqui podemos adicionar frases grandes também";
        System.out.println(frase);

        String nome = "Goku";
        System.out.println(nome);
    }
}