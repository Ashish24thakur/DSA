package LinkedList;

import java.util.Scanner;

class Linked{
    int data;
    Linked next;

    Linked(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class LinkedLIst1 {

    public static Linked head;

    public static void insert(int data)
    {
        Linked ob = new Linked(data);
        if (head == null)
        {
            head = ob;
            System.out.println("Element inserted....................");
        }
        else {
            Linked current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = ob;
            System.out.println("Element inserted....................");
        }
    }
    public static void display(Linked node)
    {
        while (node != null)
        {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
    public static void InsertAt(Linked list,int position,int data)
    {
        Linked ob = new Linked(data);
        if (position == 0)
        {
            ob.next = list;
            head = ob;
        }
        else{
            int pos = 0;
            Linked current = list;
            while (current.next != null)
            {
                pos = pos + 1;
                if (pos == position)
                {
                    ob.next = current.next;
                    current.next = ob;
                    //pos = pos + 1;
                }
                else {

                    current = current.next;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        display(head);
        InsertAt(head,2,50);
        display(head);
    }

}
