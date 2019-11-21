package calculator.database.data;

public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass() {
        instance = new SingletonClass();
    }

    public static SingletonClass getInstance(String value) {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}