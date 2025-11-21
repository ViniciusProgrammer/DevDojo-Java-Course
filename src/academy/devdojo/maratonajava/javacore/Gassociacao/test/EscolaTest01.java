package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor [] professores1 = new Professor[1];
        professores1[0] = professor1;

        // Professor [] professores = new Professor[]{professor};
        // Professor [] professores = {professor};

        // Escola escola = new Escola("Konoha", new Professor[]{professor});
        Escola escola1 = new Escola("Konoha", professores1);

        escola1.imprime();

        Professor professor2 = new Professor("Kakashi Sensei");
        Professor [] professores2 = {professor1, professor2};

        Escola escola2 = new Escola("Shinwa", professores2);

        escola2.imprime();
    }
}
