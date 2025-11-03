package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int contador = 0;
        int maximo = 50;

        while (contador <= maximo) {
            if (contador > 25) {
                break;
            } else {
                System.out.println(contador);
            }
            contador++;
        }
    }
}
