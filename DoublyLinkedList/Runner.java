package DoublyLinkedList;

import java.util.Stack;

public class Runner {


    public static void addValue(int node) {
        Node head = null, tail = null;
        Node newNode = new Node(node);

        if(head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;

            tail = newNode;
            tail.next = null;
        }

    }

    public static void main(String[] args) {

        addValue(10);
        addValue(11);
        addValue(12);
        addValue(13);

    }
}
