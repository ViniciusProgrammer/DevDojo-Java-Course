package academy.devdojo.maratonajava.javacore.Dcontrutores.test;

import academy.devdojo.maratonajava.javacore.Dcontrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Infantil", "Production GL");

        /*
            new Anime();
            cria outro objeto Anime
            usando o construtor sem argumentos
            mas não armazena a referência dele em lugar nenhum
            Ou seja, esse objeto existe apenas durante a execução desse comando e
            imediatamente fica sem referência,
         */
        //new Anime();
        anime.imprimir();
    }
}
