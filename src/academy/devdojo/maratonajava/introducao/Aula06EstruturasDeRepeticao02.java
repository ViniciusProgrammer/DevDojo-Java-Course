package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 até 1000000
        int limiteMaximo = 1000000;

        for (int i = 0; i <= limiteMaximo; i+=2) {
            System.out.println(i);
        }

        System.out.println("De outra forma");
        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
