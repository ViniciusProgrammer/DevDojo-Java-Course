package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // Inicialização de Arrays
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        System.out.println("Usando o Foreach");
        for (int numero : numeros2) {
            System.out.println(numero);
        }
    }
}
