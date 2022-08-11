public class Entrevistado {
    private char genero;
    private String idade;
    private String escolaridade;
    private String moradia;
    private String tecnologia;
    private String prioridade;

    public Entrevistado(char genero, String idade, String escolaridade, String moradia, String tecnologia, String prioridade) {
        this.genero = genero;
        this.idade = idade;
        this.escolaridade = escolaridade;
        this.moradia = moradia;
        this.tecnologia = tecnologia;
        this.prioridade = prioridade;
    }

    
    /** 
     * @param genero
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    
    /** 
     * @param idade
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }

    
    /** 
     * @param escolaridade
     */
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    
    /** 
     * @param moradia
     */
    public void setMoradia(String moradia) {
        this.moradia = moradia;
    }

    
    /** 
     * @param tecnologia
     */
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    
    /** 
     * @param prioridade
     */
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    
    /** 
     * @return char
     */
    public char getGenero() {
        return genero;
    }

    
    /** 
     * @return String
     */
    public String getIdade() {
        return idade;
    }

    
    /** 
     * @return String
     */
    public String getEscolaridade() {
        return escolaridade;
    }

    
    /** 
     * @return String
     */
    public String getMoradia() {
        return moradia;
    }

    
    /** 
     * @return String
     */
    public String getTecnologia() {
        return tecnologia;
    }

    
    /** 
     * @return String
     */
    public String getPrioridade() {
        return prioridade;
    }
}
