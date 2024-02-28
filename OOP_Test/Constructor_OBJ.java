package OOP_Test;

class Animal {
    Animal() {
        System.out.println("I am class Animal");
    }
}

class Dog extends Animal{
    Dog() {
        System.out.println("I am class Dog");
    }

}

class Doberman extends Dog{
    Doberman() {
        System.out.println("I am class Doberman");
    }

}

public class Constructor_OBJ {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("=============");
        Animal animal1 = new Dog();
        System.out.println("=============");
        Animal animal2 = new Doberman();
    }
}
