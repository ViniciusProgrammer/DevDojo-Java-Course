package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Kirito";
        String endereco = "Avenida Sebastião Flores, n° 1044";
        String dataDeRecebimentoSalario = "10/01/2025";
        double salario = 1488.55;

        String mensagemFormatada = "Eu " + nome + " morando no endereco: " + endereco + " confirmo que recebi o salário de "
                + " na data " + dataDeRecebimentoSalario;

        System.out.printf(mensagemFormatada);
    }
}
