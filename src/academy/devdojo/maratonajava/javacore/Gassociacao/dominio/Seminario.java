package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno [] alunos;
    private Local local; // esqueci essa parte
    private ProfessorSeminario professor;// achei interessamte colocar

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno [] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local, ProfessorSeminario professor) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
        this.professor = professor;
    }

    public void imprime() {
        System.out.println("Título = " + getTitulo());
        System.out.println("Ministrado pelo professor: " + professor.getNome() + " Especilista em " + professor.getEspecialiade());
        System.out.println("Endereço: " + local.getEndereco());

        if (alunos == null) {
            return;
        }

        System.out.println("Alunos do seminário");

        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " com a idade de " + aluno.getIdade() + " anos.");
        }

        System.out.println("----------------------------\n");
    }

    public static void todosSeminarios(Seminario [] seminarios) {
        System.out.println("----------Seminarios participantes--------");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
        }
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

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
