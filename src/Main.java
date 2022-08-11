import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Métodos de leitura e escrita de arquivos
        EntrevistadoVetor callMethod = csvReader();
        Arquivo.gravar(callMethod.report(), "Relatório.txt");
    }


    /**
     * @return EntrevistadoVetor
     * O método csvReader() lê o arquivo de entrada e cria um vetor de objetos Entrevistado.
     * @author Kauã Henrico
     */

    static EntrevistadoVetor csvReader() {
        String path = "Entrevista.csv";
        String line = "";
        EntrevistadoVetor entrevistadoVetor = new EntrevistadoVetor();

        // esse try é para tratar erros de leitura do arquivo
        try {
            // objeto para ler o arquivo csv e quais as informações que serão lidas e até onde vão ser lidas.
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split("; ");
                Entrevistado entrevistado = new Entrevistado(row[0].charAt(0), row[1], row[2], row[3], row[4], row[5]);
                entrevistadoVetor.add(entrevistado);
            }
            reader.close();
            // esse catch é para retornar possíveis erros de leitura do arquivo.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Relatório gerado com sucesso!");
        }
        // retorna o vetor de objetos Entrevistado
        return entrevistadoVetor;
    }
}