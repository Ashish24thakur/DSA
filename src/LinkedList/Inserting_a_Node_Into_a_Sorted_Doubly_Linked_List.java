package LinkedList;

import java.util.HexFormat;
import java.util.Scanner;

class LinkedList11{
    int data;
    LinkedList11 next;
    LinkedList11 previous;
    LinkedList11(int data)
    {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

}

public class Inserting_a_Node_Into_a_Sorted_Doubly_Linked_List {

    public static LinkedList11 Head , Tail;

    public static void insert(int data)
    {
        LinkedList11 ob = new LinkedList11(data);
        if (Head == null && Tail == null)
        {
            Head = ob;
            Tail = ob;
        }
        else {
            LinkedList11 current = Head;
            while (current.next != null)
            {
                current = current.next;
            }
            ob.previous = current;
            Tail = ob;
            current.next = ob;


            //Tail = current;
        }
    }
    public static void display(LinkedList11 head)
    {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void rdisplay(LinkedList11 head)
    {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.previous;
        }
    }
    public static void insert_sorted(LinkedList11 head,int data)
    {
        LinkedList11 ob = new LinkedList11(data);
        LinkedList11 current = head;
        while (current.next != null)
        {
            if (current.next.data > data)
            {
                LinkedList11 temp = current.next;
                current.next = ob;
                ob.previous = current;
                ob.next = temp;
                temp.previous = ob;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        display(Head);
        System.out.println("Reverse................");
        rdisplay(Tail);
        insert_sorted(Head,5);
        display(Head);

    }
}
