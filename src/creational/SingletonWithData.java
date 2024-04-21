package creational;

public class SingletonWithData {
    private static SingletonWithData instance;
    private String data;

    private SingletonWithData(String data) {
        this.data = data;
    }

    public static SingletonWithData getInstance(String data) {
        if (instance == null)
            instance = new SingletonWithData(data);
        return instance;
    }
}

class Main {
    public static void main(String[] args) {
        SingletonWithData singletonWithData = SingletonWithData.getInstance("hi");
        SingletonWithData singletonWithData2 = SingletonWithData.getInstance("hello");
        SingletonWithData singletonWithData3 = SingletonWithData.getInstance("hey");

        if (singletonWithData2 == singletonWithData && singletonWithData3 == singletonWithData)
            System.out.println("ALl instance equals");
        else System.out.println("we messed up");
    }
}