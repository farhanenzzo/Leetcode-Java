package CollectionFramework.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtFirst(50);
        list.show();
    }
}
