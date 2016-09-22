/**
 * Created by svishnu on 8/11/16.
 */
public class LinkedStackList {
    Node head = null;
    int size = 0;

    public void push(int data) {
        Node nd = new Node(data);
        if (size == 0) {
            head = nd;
        } else {
            //  Node temp = head;
            nd.next = head;
            head = nd;

        }
        size++;
        System.out.println("Pushed to stack for the element" + data);
    }

    public void pop(){
        if (size == 0) {
            System.out.println("empty stack");
        }else{
            System.out.println("Popped Data "+ head.data);
            size --;
            head = head.next;
        }
    }

    public void printStack(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}


