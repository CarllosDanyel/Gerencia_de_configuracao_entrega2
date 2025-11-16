package com.meuprojeto;

// Importe as classes da biblioteca CSV e para lidar com arquivos
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Utils.mensagem(); // Vai imprimir "Ai não"
        int a = 4;
        String nomeDoArquivo = "dados.csv";

        System.out.println("Iniciando a escrita do arquivo CSV...");

        // --- Início da Implementação CSV ---
        // Usamos "try-with-resources" para garantir que o arquivo seja fechado
        try (
            // Prepara o "escritor" de arquivo
            FileWriter out = new FileWriter(nomeDoArquivo);
            
            // Prepara o "impressor" de CSV, definindo um cabeçalho
            CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT.withHeader("Nome", "Valor"))
        ) {
            
            // Escreve a linha no arquivo
            printer.printRecord("a", a);

            System.out.println("Arquivo " + nomeDoArquivo + " escrito com sucesso!");

        } catch (IOException e) {
            // Trata erros, caso não consiga escrever o arquivo
            System.err.println("Erro ao escrever o arquivo CSV:");
            e.printStackTrace();
        }
        // --- Fim da Implementação CSV ---
    }
}