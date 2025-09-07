package LinkedList;


import java.util.LinkedList;

import static LinkedList.learnLinkedList.printLinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        learnLinkedList.Node<Integer> head  = new learnLinkedList.Node<>(1);
        learnLinkedList.Node<Integer> n1  = new learnLinkedList.Node<>(2);
        learnLinkedList.Node<Integer> n2  = new learnLinkedList.Node<>(4);
        learnLinkedList.Node<Integer> n3  = new learnLinkedList.Node<>(5);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        printLinkedList(head);
        head=reverse(head);
        printLinkedList(head);



    }

   public static <E> learnLinkedList.Node<E> reverse(learnLinkedList.Node head){
       learnLinkedList.Node<E> prev = null;
       learnLinkedList.Node<E> current = head;

       while (current != null) {
           learnLinkedList.Node<E> next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
       return prev;
   }
}
