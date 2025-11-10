package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Jiraya");
        pessoa01.setIdade(21);

        pessoa01.imprime();

        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());
    }
}
