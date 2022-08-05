import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        csvReader();
    }

    static void csvReader() {
        String path = "B:/aulaAlgoritmos/trabalhoGrupoAlgoritmos2/assets/Entrevista.csv";
        String line = "";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
                while ((line = reader.readLine()) != null) {
                    String[] row = line.split("; ");
                    Entrevistado entrevistado = new Entrevistado(row[0].charAt(0), row[1], row[2], row[3], row[4], row[5]);
                    
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
