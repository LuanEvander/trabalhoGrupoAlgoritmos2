import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        csvReader();
    }

    static void csvReader() {
        String path = "B:/aulaAlgoritmos/trabalhoGrupoAlgoritmos2/assets/Entrevista.csv";
        String line = "";
        String [] entrevistado = new String [300];
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
                while ((line = reader.readLine()) != null) {
                    String[] row = line.split("; "); // método split para separar colunas
                    System.out.println(row[1]); //sysout para selecionar a coluna
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
