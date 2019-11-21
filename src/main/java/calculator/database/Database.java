package calculator.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import calculator.domain.Taxpayer;

public class Database {
    private static Database INSTANCE = new Database();

    private final ArrayList<Taxpayer> taxpayerList;

    private Database() {
        taxpayerList = new ArrayList<>();

        loadTaxpayerList();
    }

    public static Database getInstance() {
        return INSTANCE;
    }
    public static void start() {
        getInstance();
    }



    public ArrayList<Taxpayer> getTaxpayerList() {
        return this.taxpayerList;
    }

    

    // Métodos para carregar os dados principais
    public void loadTaxpayerList() {
        final Path path = Paths.get("TaxpayerList.txt");
        try (BufferedReader br = Files.newBufferedReader(path, Charset.defaultCharset())) {
        String linha = br.readLine();
        while ((linha = br.readLine()) != null) {
            // separador: ;
            final Scanner sc = new Scanner(linha).useDelimiter(";");

            // Atributos do Contribuinte
            final String name = sc.next();
            final String cpf = sc.next();

            // Cria uma instancia do Livro e adiciona na lista
            taxpayerList.add(new Taxpayer(name, cpf));
        }
        } catch (final IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
        }
    }



    // Listagem
    public void listTaxpayerList() {
        for(final Taxpayer t: taxpayerList) {
            System.out.println();
            System.out.println(t.toString());
        }
    }

}