package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    /**
     * 1 - Alocado o espaço de memória para o objeto
     * 2 - Cada atributo de classe é criado e inicializado com os valores padrão ou o que for passado aqui dentro da classe
     * 3 - O bloco de inicialização é executado
     * 4 - O construtor é executado
     */

    /*
    * Os blocos de inicialização acontecem antes mesmo do construtor ser executado
    * de instância ou não estático
    */

    {
        System.out.println("Dentro do bloco de inicialização");

        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }
}
