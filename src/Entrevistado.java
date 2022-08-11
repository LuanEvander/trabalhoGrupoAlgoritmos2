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
     * Gênero do entrevistado
     * @author Edelin Chaves
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    /** 
     * @param idade
     * Idade do entrevistado
     * @author Edelin Chaves
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    /** 
     * @param escolaridade
     * Escolaridade do entrevistado
     * @author Edelin Chaves
     */
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
   
    /** 
     * @param moradia
     * Moradia do entrevistado
     * @author Edelin Chaves
     */
    public void setMoradia(String moradia) {
        this.moradia = moradia;
    }
  
    /** 
     * @param tecnologia
     * Tecnologia do entrevistado
     * @author Edelin Chaves
     */
    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    
    /** 
     * @param prioridade
     * Prioridade do entrevistado
     * @author Edelin Chaves
     */
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    
    /** 
     * @return char
     * Gênero do entrevistado
     * @author Edelin Chaves
     */
    public char getGenero() {
        return genero;
    }
    
    /** 
     * @return String
     * Idade do entrevistado
     * @author Edelin Chaves
     */
    public String getIdade() {
        return idade;
    }
    
    /** 
     * @return String 
     * Escolaridade do entrevistado
     * @author Edelin Chaves
     */
    public String getEscolaridade() {
        return escolaridade;
    }
    
    /** 
     * @return String
     * Moradia do entrevistado
     * @author Edelin Chaves
     */
    public String getMoradia() {
        return moradia;
    }
    
    /** 
     * @return String
     * Tecnologia do entrevistado
     * @author Edelin Chaves
     */
    public String getTecnologia() {
        return tecnologia;
    }
    
    /** 
     * @return String
     * Prioridade do entrevistado
     * @author Edelin Chaves
     */
    public String getPrioridade() {
        return prioridade;
    }
}
