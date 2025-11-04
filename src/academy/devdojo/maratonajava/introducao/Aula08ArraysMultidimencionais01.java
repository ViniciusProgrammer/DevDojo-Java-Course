package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 21;
        dias[0][1] = 18;
        dias[0][2] = 10;

        dias[1][0] = 7;
        dias[1][1] = 17;
        dias[1][2] = 29;

        dias[2][0] = 15;
        dias[2][1] = 2;
        dias[2][2] = 23;

        /**
         * Em arrays multidimencionais temos que cada índice a esquerda serve como base para o outro índice que no caso são os valores armazenados em si da posição
         * o i abaixo retorna um array e o j retorna os valores armazenados em cada array por isso temos dias[i].length o i é a referência para o array e o j é o valor naposição.
         */

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.print(dias[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Imprimindo o array utilizando o Foreach");

        for (int [] dia : dias) {
            for (int num : dia) {
                System.out.println(num);
            }
        }
    }
}
