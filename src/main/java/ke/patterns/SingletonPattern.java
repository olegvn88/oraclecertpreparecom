package ke.patterns;

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstasnce("Oleg");
        System.out.println(singleton.name);
    }
}

class Singleton {
    public String name;
    private static Singleton instance = null;

    private Singleton(String name) {
        this.name = name;
    }

    public static synchronized Singleton getInstasnce(String name) {
        if (instance == null) {
            instance = new Singleton(name);
        }
        return instance;
    }
}
