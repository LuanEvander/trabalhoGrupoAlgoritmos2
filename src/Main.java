import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        EntrevistadoVetor callMethod = csvReader();
        Arquivo.gravar(callMethod.report(), "Relatório.txt");
        System.out.println("Relatório gerado com sucesso!");
    }

    static EntrevistadoVetor csvReader() {
        String path = "Entrevista.csv";
        String line = "";
        EntrevistadoVetor entrevistadoVetor = new EntrevistadoVetor();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split("; ");
                Entrevistado entrevistado = new Entrevistado(row[0].charAt(0), row[1], row[2], row[3], row[4], row[5]);
                entrevistadoVetor.add(entrevistado);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entrevistadoVetor;
    }
}
