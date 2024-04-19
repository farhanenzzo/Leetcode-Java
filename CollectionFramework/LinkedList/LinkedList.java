package CollectionFramework.LinkedList;

import CollectionFramework.Node;

public class LinkedList {
    Node head;

    public void insertAtFirst(int userInput) {
        Node newNode = new Node();
        newNode.data = userInput;
        newNode.next = null;

        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void insertAtLast(int userInput) {
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
    public void show() {
        Node traverse = head;
        while (traverse.next != null) {
            System.out.println(traverse.data);
            traverse = traverse.next;
        }
        System.out.println(traverse.data);
    }
}
