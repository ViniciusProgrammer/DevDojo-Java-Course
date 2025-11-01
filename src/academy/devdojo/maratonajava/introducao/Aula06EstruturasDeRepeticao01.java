package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while e for

        int contador = 0;

        System.out.println("Repetição com While");

        while (contador < 10) { // sempre terá um valor booleano
            System.out.println(++contador); // imprime de 1 a 10 agora
        }

        contador = 0;

        System.out.println("\nRepetição no do while\n");

        do {
            System.out.println(++contador);
        } while (contador < 10);

        System.out.println("Usando o laço For");

        for (contador = 0; contador < 10; contador++) {
            System.out.println(contador + 1);
        }
    }
}
