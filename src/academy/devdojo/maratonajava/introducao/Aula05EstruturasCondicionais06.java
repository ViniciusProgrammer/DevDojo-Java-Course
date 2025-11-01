package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        /**
         * Dados os valores de 1 a 7 imprima se é um dia útil ou final de semana,
         * considerando 1 como domingo.
         */
        int diaDaSemana = 0;

        switch (diaDaSemana) {
            case 1:
            case 7:
                System.out.println("É final de semana!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É um dia da semana!");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }
    }
}
