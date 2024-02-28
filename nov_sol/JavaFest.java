package nov_sol;

import java.util.*;

/**
 * public class Test {
 *     final int x = 0;
 *     Test() {
 *         x = 1;
 *     }
 *     final int aMethod() {
 *         return x;
 *     }
 * }
 **/

///////////////////////////////////////////

class Base {
    int x = 2;
    int method() {
        return x;
    }
}
class Subclass extends Base {
    int x = 3;
    int method() {
        return x;
    }
}

///////////////////////////////////////////


public class JavaFest {
    public static void print(List objectList) {
        for (Object o : objectList) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {

        List languageList = new ArrayList();
        languageList.add("C");
        languageList.remove("C++");
        languageList.add ("Java");
        languageList.add("Python");
        languageList.remove("Java");

        print(languageList);

        System.out.println("///////////////////////////////////////////////////");

        Map map = new HashMap();
        map.put ("java", 1);
        map.put ("therap", 2);
        Integer val = 4;
        map.put ("java", val);
        val = val + 5;
        System.out.println(val + " " + map.get("java"));

        System.out.println("///////////////////////////////////////////////////");

        String s = new String("Bicycle");
        int x = 1;
        int y = 3;
        System.out.println(s.substring(x, y));

        System.out.println("///////////////////////////////////////////////////");

        int i = -10;
        System.out.println(--i);
        System.out.println(i++);
        System.out.println(i);

        System.out.println("///////////////////////////////////////////////////");

        Base b = new Subclass();
        System.out.println(b.x);
        System.out.println(b.method());

        System.out.println("///////////////////////////////////////////////////");

        JavaFest ob1 = new JavaFest();
        Object ob2 = ob1;
        System.out.println(ob2 instanceof Object);
        System.out. println(ob2 instanceof JavaFest);

    }
}
