public class Entrevistado {
    private char sexo;
    private String idade;
    private String escolaridade;
    private String moradia;
    private String tecnologia;
    private String prioridade;

    public Entrevistado(char sexo, String idade, String escolaridade, String moradia, String tecnologia, String prioridade) {
        this.sexo = sexo;
        this.idade = idade;
        this.escolaridade = escolaridade;
        this.moradia = moradia;
        this.tecnologia = tecnologia;
        this.prioridade = prioridade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setMoradia(String moradia) {
        this.moradia = moradia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public char getSexo() {
        return sexo;
    }

    public String getIdade() {
        return idade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public String getMoradia() {
        return moradia;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public String getPrioridade() {
        return prioridade;
    }
}
