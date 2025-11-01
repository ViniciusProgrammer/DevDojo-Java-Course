package academy.devdojo.maratonajava.introducao;

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

        /**
         * Operador do resto da divisão %
         */

        // par
        int resto = 20 % 2;
        System.out.println(resto);

        // impar
        int resto2 = 21 % 2;
        System.out.println(resto2);

        /**
         * Operadores relacionais <, >, <=, >=, == e != sempre retornaram valores booleanos
         * < menor
         * > maior
         * <= menor ou igual
         * >= maior ou igual
         * == igual
         * != diferente
         */

        boolean dezMenorQueVinte = 10 < 20; // true
        boolean dezMaiorQueVinte = 10 > 20; // false
        boolean dezIgualVinte = 10 == 20; // false
        boolean dezDiferenteVinte = 10 != 20; // true
        boolean dezIgualDez = 10 == 10; // true

        System.out.println(dezMenorQueVinte);
        System.out.println(dezMaiorQueVinte);
        System.out.println(dezIgualVinte);
        System.out.println(dezDiferenteVinte);
        System.out.println(dezIgualDez);

        /**
         * Operadores lógicos
         * && (AND) || (OU) ! (NÃO)
         */

        // AND

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        // OR

        double valorTotalContaCorrente = 200.0;
        double valorTotalContaPoupanca = 10000.0;
        float valorPlastation = 5000F;
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlastation || valorTotalContaPoupanca > valorPlastation;

        System.out.println("isPlastation5Compravel? " + isPlaystation5Compravel);

        /**
         * Operadores de atribuição
         * =, +=, -=, *=, /=, %=
         */

        double bonus = 1800;
        bonus = bonus + 200;

        System.out.println("Bonus com atribuição: " + bonus);

        bonus -= 502;
        System.out.println("Bonus com atribuição subtrativa: " + bonus);

        bonus *= 3;
        System.out.println("Bonus com atribuição multiplicativa: " + bonus);

        bonus /= 2;
        System.out.println("Bonus com atriubuição divisiva: " + bonus);

        bonus %= 2;
        System.out.println("Bonus com atribuição modulo: " + bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println("Contador: " + contador);
    }
}
