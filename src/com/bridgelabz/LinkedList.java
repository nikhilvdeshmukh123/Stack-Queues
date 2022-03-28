package com.bridgelabz;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public void addFirst(int data) {
        Node t = new Node(data);
        t.data = data;
        t.next = head;
        if (size == 0) {
            tail = t;
        }
        head = t;
        size++;
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = null;
        if (size == 0) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void show(){
        Node temp = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void insertBetween(int element1, int element2, int data) {
        if (head == null || head.next == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode.data != element1 || currNode.next.data != element2) {
            if (currNode.next.next == null) {
                break;
            }
            currNode = currNode.next;
        }
        if (currNode.data == element1 && currNode.next.data == element2) {
            Node newNode = new Node(data);
            Node temp = currNode.next;
            currNode.next = newNode;
            newNode.next = temp;
        }
        size++;
    }

    public void pop(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void popLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;
    }

    public boolean searchNode(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }
        Node currNode = head;
        while (currNode.data != data) {
            if (currNode.next == null) {
                return false;
            }
            currNode = currNode.next;
        }
        System.out.println("Search found for "+data);
        return true;
    }

    public void insertAfterSearch(int element, int data){
        Node currNode = head;
        if (searchNode(element)) {
            while (currNode.data != element) {
                currNode = currNode.next;
            }
            Node node1 = new Node(data);
            Node temp = currNode.next;
            currNode.next = node1;
            node1.next = temp;
        }
        size++;
    }

    public void deleteAfterSearch(int data) {
        if(searchNode(data)) {
            if(head.data == data) {
                head = head.next;
                return;
            }
            Node currNode = head;
            while(currNode.next.data != data) {
                currNode = currNode.next;
            }
            Node temp = currNode.next.next;
            currNode.next = temp;
        }
        size--;
    }
    public int getSize() {
        System.out.println();
        return size;
    }

    void sortedInsert(int data)
    {
        Node newNode = new Node(data);
        Node current;
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        }
        else {
            current = head;
            while (current.next != null
                    && current.next.data < newNode.data)
                current = current.next;
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void peek() {
        if (head == null) {
            return;
        }
        System.out.println(head.data);
    }
}