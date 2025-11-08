package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.nome = "Ana Vitória";
        funcionario1.idade = 21;

        funcionario2.nome = "Pedro";
        funcionario2.idade = 23;
        funcionario2.salarios = new double[]{1234.33, 2513.12, 899.64};

        double [] salariosFuncionario = new double [3];

        salariosFuncionario[0] = 1248.32;
        salariosFuncionario[1] = 2300.90;
        salariosFuncionario[2] = 1534.19;

        funcionario1.salarios = salariosFuncionario;

        funcionario1.imprimirDadosFuncionario();
        funcionario2.imprimirDadosFuncionario();

        // Para testar a validação básica dos dados na classe Funcionario
        funcionario3.nome = "";
        funcionario3.idade = 22;
        funcionario3.salarios = new double[]{1234.55, 1234.44, 1234.55};

        funcionario3.imprimirDadosFuncionario();
    }
}
