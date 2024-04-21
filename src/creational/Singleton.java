package creational;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}

class MainClass {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton Singleton2 = Singleton.getInstance();
        Singleton Singleton3 = Singleton.getInstance();

        if (Singleton2 == singleton && Singleton3 == singleton)
            System.out.println("ALl instance equals");
        else System.out.println("we messed up");
    }
}