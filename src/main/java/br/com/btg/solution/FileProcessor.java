package br.com.btg.solution;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProcessor {

    private static List<String> lines = new ArrayList<>();

    static void main() {

        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            lines = br.lines()
                    .parallel()
                    .map(String::toUpperCase)
                    .toList();
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo data.txt nao encontrado");
        } catch (Exception e) {
            System.err.println("Erro ao ler o arquivo data.txt");
        }
        System.out.println("Lines processed: " + lines.size());
    }
}