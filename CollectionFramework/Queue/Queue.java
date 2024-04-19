package CollectionFramework.Queue;

import CollectionFramework.Node;

public class Queue {
    Node head;

    public void add(int userInput) {
        Node newNode = new Node();
        newNode.data = userInput;
        newNode.next = null;

        if(head == null) {
            head = newNode;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }
    public void remove() {
        head = head.next;
    }
    public void show() {
        Node traverse = head;
        while (traverse.next != null) {
            System.out.println(traverse.data);
            traverse = traverse.next;
        }
        System.out.println(traverse.data);
    }
}
