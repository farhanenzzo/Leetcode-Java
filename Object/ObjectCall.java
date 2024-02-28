package Object;
public class ObjectCall {
    public static void main(String[] args) {
        Base base = new Sub();
        System.out.println("Base Object: " + base.num);
        System.out.println(base.does());
        System.out.println("-----------------------");
        Sub sub = new Sub();
        System.out.println("Sub Object: " + sub.num);
        System.out.println(sub.does());
    }
}
class Base {
    int num = 1;
    int does() {
        return num;
    }
}
class Sub extends Base {
    int num = 2;
    int does() {
        return num;
    }
}

