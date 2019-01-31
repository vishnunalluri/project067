package com.vishnu.java.collections;

public class TestingCustomLinkedList
{
    public static void main(String[] args) {

        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add(10);
        customLinkedList.add(20);
        customLinkedList.add(30);
        customLinkedList.add(70);
        customLinkedList.add(80);
        customLinkedList.add(90);

        System.out.println("------Linked List Values--------");
        //CustomLinkedList customLinkedList1 = new CustomLinkedList();
        customLinkedList.addFirst(40);
        customLinkedList.addFirst(50);
        customLinkedList.addFirst(60);
        //customLinkedList1.addFirst(20);
        customLinkedList.print();
        System.out.println("------Linked List Values After Remove First --------");
        customLinkedList.removeFirst();
       /* customLinkedList.removeFirst();
        customLinkedList.removeFirst();
        customLinkedList.removeFirst();*/
        customLinkedList.print();
        System.out.println("------Linked List Values After Remove Last --------");
        customLinkedList.removeLast();
        customLinkedList.print();
        System.out.println("------Linked List Values After Remove Given Value --------");
        customLinkedList.remove(40);
        customLinkedList.remove(20);
        customLinkedList.remove(70);
        customLinkedList.print();


    }
}
