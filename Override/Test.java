package Override;

public class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.talk();

    }
}
class A {
    public void talk() {
        System.out.println("Mew");
    }
}
class B extends A {
    public void talk() {
        System.out.println("Woof");
    }
}
