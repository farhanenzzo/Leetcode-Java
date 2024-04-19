package CollectionFramework.Stack;

import CollectionFramework.Node;

public class Stack {
    Node head;

    public void push(int userInput) {
        Node newNode = new Node();
        newNode.data = userInput;
        newNode.next = null;

        if(head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void pop() {
        head = head.next;
    }

    public int peak() {
        return head.data;
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
