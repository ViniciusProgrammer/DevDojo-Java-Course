package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ProfessorSeminario;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fábio");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Tiago");
        Aluno aluno4 = new Aluno("Jess");
        Aluno aluno5 = new Aluno("Theo");

        Aluno [] alunosReligiosos = {aluno1, aluno2};
        Aluno [] alunosFilosoficos = {aluno3, aluno4, aluno5};

        Seminario seminarioReligioso = new Seminario("Seminário religioso", alunosReligiosos);
        Seminario seminarioFilosofico = new Seminario("Seminário filosófico", alunosFilosoficos);

        Seminario [] seminariosParticipantes = {seminarioReligioso, seminarioFilosofico};

        Local localidade = new Local("São Sebastião");

        ProfessorSeminario professorJoao = new ProfessorSeminario("João Maria", "Espiritualidade", localidade, seminariosParticipantes);

        System.out.println("Seminário religioso");
        seminarioReligioso.imprime();

        System.out.println("Seminário Filosófico");
        seminarioFilosofico.imprime();
    }
}
