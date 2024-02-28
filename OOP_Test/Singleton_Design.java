package OOP_Test;

class Singleton {
    //static instance variable
    static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        System.out.println("I am Singleton");
    }

    // Public method to provide the global point of access
    public static Singleton getInstance() {
        // Create the instance if it doesn't exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Singleton_Design {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
    }
}
