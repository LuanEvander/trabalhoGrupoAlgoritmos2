import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        EntrevistadoVetor callMethod = csvReader();
        
        System.out.println(callMethod.stats1());
        System.out.println(callMethod.stats2());
        System.out.println(callMethod.stats3());
        System.out.println(callMethod.stats4());
        System.out.println(callMethod.stats5());
        System.out.println(callMethod.stats6());
        System.out.println(callMethod.stats7());
    }

    static EntrevistadoVetor csvReader() {
        String path = "B:/aulaAlgoritmos/trabalhoGrupoAlgoritmos2/assets/Entrevista.csv";
        String line = "";
        EntrevistadoVetor entrevistadoVetor = new EntrevistadoVetor();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split("; ");
                Entrevistado entrevistado = new Entrevistado(row[0].charAt(0), row[1], row[2], row[3], row[4], row[5]);
                entrevistadoVetor.add(entrevistado);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entrevistadoVetor;
    }
}
