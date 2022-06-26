package LinkedList;

import java.util.Scanner;

class LinkedList3{
    int data;
    LinkedList3 next;
    LinkedList3(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class ReverseLinkedList {

    public static LinkedList3 head;

    public static void insert(int data)
    {
        LinkedList3 ob = new LinkedList3(data);
        if (head == null)
        {
            head = ob;
        }
        else {
            LinkedList3 current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = ob;
        }
    }
    public static void display(LinkedList3 node)
    {
        while (node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static void reverse(LinkedList3 node)
    {
        LinkedList3 current = null;
        LinkedList3 previous = null;
        LinkedList3 pointer = head;
        while (pointer != null)
        {
            current = pointer;
            pointer = pointer.next;
            current.next = previous;
            previous = current;
            head = current;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        display(head);
        System.out.println("After reversing.......................................");
        reverse(head);
        display(head);
    }
}
