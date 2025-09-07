package LinkedList;

public class learnLinkedList {
    public static void main(String[] args){
        Node<Integer> head  = new Node<>(1);
        Node<Integer> n1  = new Node<>(2);
        Node<Integer> n2  = new Node<>(4);
        Node<Integer> n3  = new Node<>(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        printLinkedList(head);

        head = addElement(2,3,head);
        printLinkedList(head);
        head= deleteElement(3,head);
        printLinkedList(head);


    }

    public static Node<Integer> addElement(int pos, int data, Node<Integer> head){
       Node<Integer> newNode = new Node<>(data);

       if(pos==0){
           newNode.next = head;
           return  newNode;
       }
       Node<Integer> temp = head;

       for(int i=0;i<pos-1;i++){
           temp=temp.next;
       }

       newNode.next = temp.next;
       temp.next = newNode;


        return head;
    }


    public static Node<Integer> deleteElement(int pos, Node<Integer> head){
        if(pos==0){
            return head.next;
        }
        Node<Integer> temp = head;

        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.val +" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node<E> {
        E val;
        Node<E> next;

        public Node(E val) {
            this.val = val;
            this.next = null;
        }
    }
}
