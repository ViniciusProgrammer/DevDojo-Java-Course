package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor [] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor [] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        // imprime o nome da escola
        System.out.println(this.nome);

        if (professores == null) {
            return;
        }
        // imprime os professores
        for (Professor professor : professores) {
            // chama o toString dentro de professor só passando a palavra professor
            System.out.println(professor);
        }

        System.out.println("-----------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
