package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("55555666-000");

        Pessoa pessoa = new Pessoa("Toyihisa Shimazu");
        pessoa.setCpf("7885421215-56");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("894453121-51");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000.00);

        System.out.println("=============================");
        funcionario.imprime();
    }
}
