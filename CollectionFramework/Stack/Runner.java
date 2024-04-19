package CollectionFramework.Stack;

public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.show();
        stack.pop();
        System.out.println("----------");
        stack.show();
        System.out.println("Peak: " + stack.peak());
    }
}
