package com.DataStruc.LinkedList;

public class DoublyLinkedListImpl {

    int size =0;
    Node head = null;
    Node tail = null;

    public Node addAtStart(int data){
        System.out.println("Adding Node " + data + " at the start");
        Node n = new Node(data);
        if(size==0){
            head = n;
            tail = n;
        }else{
            n.next = head;
            head.previous = n;
            head = n;
        }
        size++;
        return n;
    }

    public Node addAtEnd(int data){
        System.out.println("Adding Node " + data + " at the End");
        Node n = new Node(data);
        if(size==0){
            head = n;
            tail = n;
        }else{
            tail.next = n;
            n.previous = tail;
            tail =n;
        }
        size++;
        return n;
    }

    public Node addAfter(int data, Node prevNode){
        if(prevNode==null){
            System.out.println("Node after which new node to be added cannot be null");
            return null;
        }else if(prevNode==tail){//check if it a last node
            return addAtEnd(data);
        }else{
            System.out.println("Adding node after "+ prevNode.data);
            //create a new node
            Node n = new Node(data);

            //store the next node of prevNode
            Node nextNode = prevNode.next;

            //make new node next points to prevNode
            n.next = nextNode;

            //make prevNode next points to new Node
            prevNode.next = n;

            //make nextNode previous points to new node
            nextNode.previous = n;

            //make  new Node previous points to prevNode
            n.previous = prevNode;
            size++;
            return n;
        }
    }

    public void deleteFromStart(){
        if(size==0){
            System.out.println("\nList is Empty");
        }else{
            System.out.println("\ndeleting node " + head.data + " from start");
            head = head.next;
            size--;
        }
    }

    public void deleteFromEnd(){
        if(size==0){
            System.out.println("\nList is Empty");
        }else if(size==1){
            deleteFromStart();
        }else{
            //store the 2nd last node
            int x = tail.data;
            Node prevTail = tail.previous;

            //detach the last node
            tail = prevTail;
            tail.next=null;
            System.out.println("\ndeleting node " + x + " from end");
            size--;
        }
    }

    public int elementAt(int index){
        if(index>size){
            return -1;
        }
        Node n = head;
        while(index-1!=0){
            n=n.next;
            index--;
        }
        return n.data;
    }

    //get Size
    public int getSize(){
        return size;
    }

    public void print(){
        Node temp = head;
        System.out.print("Doubly Linked List: ");
        while(temp!=null){
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListImpl d = new DoublyLinkedListImpl();
        Node x = d.addAtStart(1);
        d.addAtStart(2);
        d.print();
        d.addAtEnd(3);
        d.print();
        d.addAtEnd(4);
        d.print();
        d.addAtEnd(5);
        d.print();
        d.addAfter(6,x);
        d.print();
        d.deleteFromStart();
        d.print();
        System.out.println("Element at index 2: "+d.elementAt(2));
        d.addAtStart(1);
        d.print();
        d.deleteFromEnd();
        d.print();
        System.out.println("Size of the Linked List: " + d.getSize());
    }
}



