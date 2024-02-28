package OOP_Test;

public class Constructor_Chaining {
    private int value;

    // Default constructor
    public Constructor_Chaining() {
        this(0); // Calls the parameterized constructor with a default value of 0
    }

    // Parameterized constructor
    public Constructor_Chaining(int value) {
        this.value = value;
    }

    // Getter method
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        // Create an object using the default constructor
        Constructor_Chaining obj1 = new Constructor_Chaining();
        System.out.println("Value of obj1: " + obj1.getValue());

        // Create an object using the parameterized constructor
        Constructor_Chaining obj2 = new Constructor_Chaining(42);
        System.out.println("Value of obj2: " + obj2.getValue());
    }
}
