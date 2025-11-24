package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Bebeto");
        Jogador jogador2 = new Jogador("Neuer");
        Time selecaoBrasileira = new Time("Seleção brasileira");
        Time selecaoAlema = new Time("Seleção Alemã");

        jogador1.setTime(selecaoBrasileira);
        jogador2.setTime(selecaoAlema);

        // Forma diferente de se criar um array dentro do metodo
        selecaoBrasileira.setJogadores(new Jogador []{jogador1});
        selecaoAlema.setJogadores(new Jogador[]{jogador2});

        System.out.println("TIME");
        // ponto de vista do time
        selecaoBrasileira.imprime();
        selecaoAlema.imprime();

        System.out.println("\nJOGADOR\n");
        // ponto de vista do jogador
        jogador1.imprime();
        jogador2.imprime();
    }
}
