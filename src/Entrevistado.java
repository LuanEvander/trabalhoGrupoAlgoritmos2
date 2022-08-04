import java.io.*;

public class Entrevistado implements Serializable {
    private String sexo;
    private String idade;
    private String escolaridade;
    private String moradia;
    private String tecnologia;
    private String prioridade;

    public String toString () {
        return this.sexo + " ; " + this.idade + " ; " + this.escolaridade + " ; " + this.moradia + " ; " + this.tecnologia + " ; " + this.prioridade;
    }
}
