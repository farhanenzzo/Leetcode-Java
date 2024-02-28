import java.util.Arrays;

class Dog extends Creature{
    void printName() {
        System.out.println("Dog is printing");
    }

}
class Creature {
    void printName() {
        System.out.println("Animal is printing");
    }

}

public class Animal {
    public static void main(String[] args) {
        Creature creature = new Dog();
        creature.printName();
        System.out.println(creature instanceof Creature);
    }
}


