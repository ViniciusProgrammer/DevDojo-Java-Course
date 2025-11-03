package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /**
         * Os tipos primitivos possuem valores padrões que não são aplicados quando estamos dentro de um escopo local
         *
         * byte, short, int, long, float e double usamos o 0 ou 0.0 para flutuantes
         *
         * char = '\u0000', boolean = false, String = null, Qualquer outro tipo de objeto o padrão é null
         */

        boolean[] booleans = new boolean[3];

        System.out.println("Booleans");

        // false impressos
        System.out.println(booleans[0]);
        System.out.println(booleans[1]);
        System.out.println(booleans[2]);

        String[] strings = new String[3];

        System.out.println("Strings");

        // null impressos
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);

        float[] floats = new float[3];

        System.out.println("floats ou doubles");
        // 0.0 impressos, o mesmo valor serve para double
        System.out.println(floats[0]);
        System.out.println(floats[1]);
        System.out.println(floats[2]);

        int[] ints = new int[3];

        System.out.println("Inteiros em gerais");
        // 0 impressos, byte, short, long
        System.out.println(ints[0]);
        System.out.println(ints[1]);
        System.out.println(ints[2]);

        System.out.println("Nomes");

        String[] nomes = new String[4];

        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}