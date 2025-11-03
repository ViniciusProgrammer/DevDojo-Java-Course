package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        //int numeroParcelas = 0;
        // double condicao = 1000;

        /*
        while (valorCarro >= condicao) {
            if (valorCarro >= condicao) {
                numeroParcelas++;
                valorCarro -= condicao;
            } else {
                break;
            }
        }
        */

        // System.out.println("Número de parcelas = " + numeroParcelas);

        System.out.println("Abordado o problema de uma forma diferente");

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Em " + parcela + "x" + " pagarei " + valorParcela + " parcela");
        }
    }
}
