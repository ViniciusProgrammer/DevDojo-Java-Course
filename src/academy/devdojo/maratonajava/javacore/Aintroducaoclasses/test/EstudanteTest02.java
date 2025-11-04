package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Sanji";
        estudante2.idade = 14;
        estudante2.sexo = 'F';

        /**
         *  Basicamente se imprimimos sem inicializarmos os atributos do objeto
         *  simplesmente veremos os valores padrões dos tipos primitivos que
         *  estão dentro da classe que o objeto é derivado
         */

        System.out.println("--------------ESTUDANTE 1-------------------");

        System.out.println("Nome: " + estudante1.nome);
        System.out.println("Idade: " + estudante1.idade);
        System.out.println("Sexo: " + estudante1.sexo);

        System.out.println("----------------ESTUDANTE 2-------------------");

        System.out.println("Nome: " + estudante2.nome);
        System.out.println("Idade: " + estudante2.idade);
        System.out.println("Sexo: " + estudante2.sexo);
    }
}
