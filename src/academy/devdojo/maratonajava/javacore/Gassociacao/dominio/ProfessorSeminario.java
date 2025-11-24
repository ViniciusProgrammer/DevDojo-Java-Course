package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class ProfessorSeminario {
    private String nome;
    private String especialiade;
    private Local local;
    private Seminario [] seminarios;

    public ProfessorSeminario(String nome) {
        this.nome = nome;
    }

    public ProfessorSeminario(String nome, String especialiade) {
        this.nome = nome;
        this.especialiade = especialiade;
    }

    public ProfessorSeminario(String nome, String especialiade, Local local) {
        this.nome = nome;
        this.especialiade = especialiade;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialiade() {
        return especialiade;
    }

    public void setEspecialiade(String especialiade) {
        this.especialiade = especialiade;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
