package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[5][];
        int[] array = {1, 2, 3};

        // Podemos ter para cada posição do arrau base um variado número de posições
        arrayInt[0] = new int[2]; // posição 0 temos 2 posições
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        // Iniicalizações
        arrayInt[3] = array;
        arrayInt[4] = new int[]{1, 2, 3, 4, 5, 6};

        // Outra forma de iniciailizar diferente
        int[][] arrayInt2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Imprimindo
        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.print(num);
            }
            System.out.println();
        }

        // Imprimindo o array diferenciado
        for (int[] arrayBase : arrayInt2) {
            for (int arr : arrayBase) {
                System.out.println(arr);
            }
        }
    }
}
