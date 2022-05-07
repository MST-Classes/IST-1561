package me.nhall.hw;

public class LinkedListProblem {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();

        list.remove(2);
        list.print();
    }
}

class Node {
    private int data;
    private Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

class LinkedList {
    Node head;

    public int get(int index) {
        Node current = head;
        int c = 0;

        while (current != null) {
            if (c == index) return current.getData();
            c++;
            current = current.getNext();
        }
        return 0;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            node.setNext(null);
        } else {
            Node temp = head.getNext();
            if (temp == null) {
                temp = head;
            }

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);

        }
    }

    public void remove(int n) {
        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            if (second.getNext() == null && i == n - 1) {
                head = head.getNext();
                return;
            }
            second = second.getNext();
        }
        while (second.getNext() != null) {
            first = first.getNext();
            second = second.getNext();
        }
        first.setNext(first.getNext().getNext());
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " > ");
            temp = temp.getNext();
        }
        System.out.print("null");
        System.out.println("\n");
    }
}