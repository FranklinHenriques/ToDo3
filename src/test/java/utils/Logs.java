package utils;


import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    //Metodo que vai Criar o arquivo de log no inicio da Execução

    public void iniciarLogCSV(String dataHora) throws IOException {
        String[] cabecalho = {"data e hora" ,"caso de teste", "mensagem"};
        Writer escritor = Files.newBufferedWriter(Paths.get("target/logs/log - "+ dataHora +".csv"));
        CSVWriter escritorCSV = new CSVWriter(escritor);
        escritorCSV.writeNext(cabecalho);
        escritorCSV.flush();
        escritor.close();
    }

public void registrarCSV(String dataHoraLog , String casoDeTeste, String mensagem) throws IOException {
    String[] cabecalho = {"data e hora" ,"caso de teste", "mensagem"};
    List<String[]> linhas = new ArrayList<>();
    linhas.add(new String[]{"2022-07-12 17-40", "Logon Portal","Iniciou o Teste"});
    Writer escritor = Files.newBufferedWriter(Paths.get("target/logs/log1.cvs"));
    CSVWriter escritorCSV = new CSVWriter(escritor);
    escritorCSV.writeNext(cabecalho);
    escritorCSV.writeAll(linhas);
    escritorCSV.flush();
    escritor.close();


}

}
