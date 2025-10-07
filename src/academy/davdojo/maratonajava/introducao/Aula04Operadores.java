package academy.davdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        /**
         * Operadores aritméticos binários (n operador n)
         * + Adição
         * - Subtração
         * / Divisão
         * * Multiplicação
         */

        int primeiroNumero = 10;
        int segundoNumero = 20;

        // resultado aqui será uma operação de adição
        System.out.println(primeiroNumero + segundoNumero);

        // diferentemente aqui, pois o compilador detectará uma concatenação
        System.out.println("Valor é " + primeiroNumero + segundoNumero);

        int resultadoDaSomaDeDoisValores = primeiroNumero + segundoNumero;
        System.out.println(resultadoDaSomaDeDoisValores);

        /*
            Divisão
         */

        int valor1 = 10;
        int valor2 = 20;
        int resultadoDaDivisao = valor1 / valor2;

        // Uma divisão entre números inteiros retorna um inteiro
        System.out.println(resultadoDaDivisao);

        double valor1Correto = 10;
        double valor2Correto = 20;
        double resultadoCorretoDaDivisao = valor1Correto / valor2Correto;

        // precisaria apenas um dos valores ser double pra retornar corretamente o resultado
        System.out.println(resultadoCorretoDaDivisao);

        /*
            Multiplicação
         */
        int primeiroValor = 10;
        int segundoValor = 20;
        int multiplacaoEntreDoisValores = primeiroValor * segundoValor;

        System.out.println(multiplacaoEntreDoisValores);

        /*
            Subtração
         */

        int maiorValor = 20;
        int menorValor = 10;
        int diferenca = maiorValor - menorValor;

        System.out.println(diferenca);
    }
}
