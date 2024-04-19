package CollectionFramework.Queue;

public class Runner {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.show();

        queue.remove();
        System.out.println("---- after remove ----");
        queue.show();
    }
}
