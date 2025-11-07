package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        Calculadora calculadora = new Calculadora();

        calculadora.alteraDoisNumeros(numero1, numero2);

        System.out.println("Dentro de CalculadoraTest04");
        System.out.println(numero1);
        System.out.println(numero2);
    }
}
