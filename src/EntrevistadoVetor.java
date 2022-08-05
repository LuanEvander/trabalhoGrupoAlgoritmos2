public class EntrevistadoVetor {
    public Entrevistado [] entrevistadoRelatorio = new Entrevistado[300];
    private int next = 0;

    public void setEntrevistadoVetor (Entrevistado[]entrevistadoRelatorio) {
        this.entrevistadoRelatorio = entrevistadoRelatorio;
    }
    
    public void add (Entrevistado entrevistado) {
        entrevistadoRelatorio[next] = entrevistado;
        next++;
    }
}
