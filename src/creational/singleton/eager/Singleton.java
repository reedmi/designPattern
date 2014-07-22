package creational.singleton.eager;

public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
