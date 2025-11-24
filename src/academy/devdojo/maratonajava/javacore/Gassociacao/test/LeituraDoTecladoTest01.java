package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Informe F ou M para o seu sexo: ");
        char sexo = scanner.next().charAt(0);

        imprime(nome, idade, sexo);

        /*
        * Poderia ser chamado assim também
        *         LeituraDoTecladoTest01.imprime(nome, idade, sexo);
        * */

        scanner.close();
    }

    public static void imprime(String nome, int idade, char sexo) {
        System.out.println("\n-----------------Dados do usuário(a)--------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
