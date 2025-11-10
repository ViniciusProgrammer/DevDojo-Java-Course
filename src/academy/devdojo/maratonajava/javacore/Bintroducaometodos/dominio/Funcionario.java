package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private double media;

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

        media = somaDosSalarios / salarios.length;

        System.out.println("A media = " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}