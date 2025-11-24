package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ProfessorSeminario;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local localidade1 = new Local("Rua São Sebastião");
        Local localidade2 = new Local("Rua do IMD");

        Aluno aluno1 = new Aluno("Fábio", 23);
        Aluno aluno2 = new Aluno("Maria", 19);
        Aluno aluno3 = new Aluno("Tiago", 18);
        Aluno aluno4 = new Aluno("Jess", 34);
        Aluno aluno5 = new Aluno("Theo", 22);

        Aluno [] alunosReligiosos = {aluno1, aluno2};
        Aluno [] alunosFilosoficos = {aluno3, aluno4, aluno5};

        ProfessorSeminario professorJoao = new ProfessorSeminario("João Maria", "Espiritualidade", localidade1);
        ProfessorSeminario professorGeorge = new ProfessorSeminario("George Farias", "Pavimentação", localidade1);

        Seminario seminarioFilosofico = new Seminario("Seminário filosófico", alunosFilosoficos, localidade2, professorJoao);
        Seminario seminarioReligioso = new Seminario("Seminário religioso", alunosReligiosos, localidade1, professorJoao);

        ProfessorSeminario professorAndre = new ProfessorSeminario("André Brito", "Gameficação de jogos", localidade2);

        Seminario seminarioJogos = new Seminario("Gameficando aulas", alunosFilosoficos, localidade2, professorAndre);

        Seminario [] seminariosParticipantes = {seminarioReligioso, seminarioFilosofico, seminarioJogos};

        System.out.println("Seminário 01");
        seminarioReligioso.imprime();

        System.out.println("Seminário 02");
        seminarioFilosofico.imprime();

        System.out.println("Seminário 03");
        seminarioJogos.imprime();

        Seminario.todosSeminarios(seminariosParticipantes);
    }
}
