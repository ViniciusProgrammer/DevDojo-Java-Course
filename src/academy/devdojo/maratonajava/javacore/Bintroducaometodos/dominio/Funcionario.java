package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprimirDadosFuncionario() {
        if (nome.isEmpty() || salarios == null || idade < 0 || idade > 130) {
            return;
        }

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Salários: R$ ");

        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

        System.out.println("\n");

        mediaSalarialFuncionario();
    }

    public void mediaSalarialFuncionario() {
        if (salarios == null) {
            return;
        }

        double somaDosSalarios = 0;

        for (double salario : salarios) {
            somaDosSalarios += salario;
        }

        System.out.println("A media = " + (somaDosSalarios / salarios.length));
    }
}
