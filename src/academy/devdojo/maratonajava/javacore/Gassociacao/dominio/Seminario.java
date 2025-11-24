package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno [] alunos;

    public Seminario(String titulo, Aluno [] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Título = " + getTitulo());

        if (alunos == null) {
            return;
        }

        System.out.println("Alunos do seminário");

        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

        System.out.println("----------------------------\n");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno [] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno [] alunos) {
        this.alunos = alunos;
    }
}
