package me.nhall.lab;

import java.util.Scanner;

public class Lab10 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();

        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.print();
    }
}

class Node {
    private int data;
    private Node next;

    Node(int d) {
        this.data = d;
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
            if (c == index)
                return current.getData();
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