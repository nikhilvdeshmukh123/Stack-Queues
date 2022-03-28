package com.bridgelabz;

public class MainClass {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.sortedInsert(56);
        linkedList.sortedInsert(30);
        linkedList.sortedInsert(40);
        linkedList.sortedInsert(70);
        linkedList.show();
        System.out.println("Size = " +linkedList.getSize());
    }
}