package OOP_Test;

class C {

    public void print() {
        System.out.println("I am class C");
    }
}

class A extends C{
    @Override
    public void print() {
        System.out.println("I am class A");
    }

}

class B extends A{
    @Override
    public void print() {
        System.out.println("I am class B");
    }

}

class D extends A{

}


public class Inherit_OBJ {
    public static void main(String[] args) {
        D d = new D();
        d.print();
        System.out.println("===================");
        B b = new B();
        b.print();
        System.out.println("===================");
        A a1 = new A();
        a1.print();
        System.out.println("===================");
        A a2 = new B();
        a2.print();
        System.out.println("===================");

        C c = new C();
        c.print();
        System.out.println("===================");

        C c1 = new A();
        c1.print();

        System.out.println("===================");

        C c2 = new B();
        c2.print();

    }
}
