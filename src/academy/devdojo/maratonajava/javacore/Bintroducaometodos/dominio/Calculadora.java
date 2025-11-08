package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int numero1, int numero2) {
        System.out.println(numero1 * numero2);
    }

    public double divideDoisNumeros(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            return 0;
        }
    }

    public void imprimeDoisNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("Não existe divisão por 0");
            return; // funciona como um breack em métodos void
        } else {
            System.out.println(numero1 / numero2);
        }
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Número1 = " + numero1);
        System.out.println("Número2 = " + numero2);
    }

    public void somaArray(int [] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Soma = " + soma);
    }

    public void somaVarargs(int ... numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Soma = " + soma);
    }
}
