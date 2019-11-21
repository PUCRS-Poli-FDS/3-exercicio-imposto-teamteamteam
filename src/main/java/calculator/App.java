package calculator;

import calculator.database.Database;
import calculator.userinterface.console.Menu;

/**
 * Calls methods from userinterface package
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Database.start();

        Menu.getInstance().showMenu();
    }
}
