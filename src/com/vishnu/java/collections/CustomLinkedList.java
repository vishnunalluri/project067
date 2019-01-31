package com.vishnu.java.collections;

public class CustomLinkedList {

    private Node headRef;

    public void add(int value)
    {
        Node node = new Node();
        node.setData(value);
        node.setNextNodeRef(null);
        if(headRef == null)
        {
            headRef = node;
        }
        else
        {
            Node tempRef = headRef;
            Node preRef = null;
            while(tempRef!=null)
            {
                preRef = tempRef;
                tempRef = tempRef.getNextNodeRef();
            }

            preRef.setNextNodeRef(node);

        }
    }

    public void addFirst(int value)
    {
        Node node = new Node();
        node.setData(value);
        node.setNextNodeRef(headRef);

            headRef = node;
    }

    public void remove(int value)
    {
        Node tempRef = headRef;
        Node prvRef = null;
        Node nextRef = null;

        while(tempRef!= null && tempRef.getData() != value)
        {
                prvRef = tempRef;
                tempRef = tempRef.getNextNodeRef();
        }
            nextRef=tempRef.getNextNodeRef();
            prvRef.setNextNodeRef(nextRef);

    }


    public void removeFirst()
    {
        Node tempRef;

            tempRef = headRef.getNextNodeRef();
            headRef = tempRef;

    }
    
    public void removeLast()
    {
        Node tempRef = headRef;
        Node prvRef = null;
        while(tempRef.getNextNodeRef() != null) 
        {
            prvRef = tempRef;
            tempRef = tempRef.getNextNodeRef();
        }
        prvRef.setNextNodeRef(null);
    }


    public void print()
    {
        Node temp = headRef;
        if(temp == null) {
            System.out.println("List is Empty");
        }
        else {
            while (temp != null) {
                System.out.println(temp.getData());
                temp = temp.getNextNodeRef();
            }
        }
    }

}


class Node
{
   private int data;
   private Node nextNodeRef;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNodeRef() {
        return nextNodeRef;
    }

    public void setNextNodeRef(Node nextNodeRef) {
        this.nextNodeRef = nextNodeRef;
    }
}