package calculator.userinterface.console;

import java.util.Scanner;

import calculator.database.Database;

public class Menu {
    private static Menu INSTANCE = new Menu();

    private Menu() {
    }

    public static Menu getInstance() {
        return INSTANCE;
    }

    public void showMenu() {
        System.out.println("--------------------------");
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 - Listar Taxpayers");

        System.out.println("0 - Sair");
        System.out.print("\n$ Digite a opção: ");

        Scanner ler = new Scanner(System.in);
        int opc = ler.nextInt();

        switch(opc) {
            case 1:
                showTaxpayerList();
                break;
            case 0:
                System.out.println("\nVolte logo!");
                break;
            default:
                showMenu();
                break;
        }
    }

    public void showTaxpayerList() {
        System.out.println("--------------------------");
        System.out.println("LISTA DE TAXPAYERS");
        Database.getInstance().listTaxpayerList();
        System.out.println("\nFim!");
        // Wait 2 seconds;
        try{ 
            Thread.sleep(2000); 
        } catch(Exception e) {
            Thread.currentThread().interrupt();
        }
        showMenu();
    }
}