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
                    /*String[] row = line.split("; "); // método split para separar colunas
                    System.out.println(row[4]);*/ //sysout para selecionar a coluna
                    System.out.println(line);
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
