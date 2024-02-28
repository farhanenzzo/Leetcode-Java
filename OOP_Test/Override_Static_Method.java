package OOP_Test;

class Atif {
    public static void listen() {
        System.out.println("I am listening Atif");
    }
}

class Weekend extends Atif{
    public static void listen() {
        System.out.println("I am listening Weekend");
    }
}

public class Override_Static_Method {
    public static void main(String[] args) {
        Atif.listen();
        Weekend.listen();
    }
}

/*
I am listening Atif
I am listening Atif
*/

