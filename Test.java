import java.util.ArrayList;
import java.util.List;

class Pen {
    String color;

    public void printColor() {
        System.out.println(this.color);
    }
}

public class Test {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.color = "black";

        pen.printColor();

    }
}
