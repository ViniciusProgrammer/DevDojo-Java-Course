package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class ProfessorSeminario {
    private String nome;
    private String especialiade;
    private Local local;
    private Seminario [] seminarios;

    public ProfessorSeminario(String nome, String especialiade, Local local, Seminario[] seminarios) {
        this.nome = nome;
        this.especialiade = especialiade;
        this.local = local;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return especialiade;
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
