import java.io.*;

//A classe Main serve para ler o arquivo de entrada e cria um arquivo txt com o resultado.
public class Main {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        EntrevistadoVetor callMethod = csvReader();
        Arquivo.gravar(callMethod.report(), "Relatório.txt");
        System.out.println("Relatório gerado com sucesso!");
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

        // esse try é para ler o arquivo csv e quais as informações que serão lidas e até onde vão ser lidas.
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split("; ");
                Entrevistado entrevistado = new Entrevistado(row[0].charAt(0), row[1], row[2], row[3], row[4], row[5]);
                entrevistadoVetor.add(entrevistado);
            }

            // esse catch é para caso o arquivo não seja encontrado
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // retorna o vetor de objetos Entrevistado
        return entrevistadoVetor;
    }
}