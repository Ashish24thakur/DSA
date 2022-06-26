package LinkedList;

import java.util.Scanner;

class LinkedList2{
    int data;
    LinkedList2 next;
    LinkedList2(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class DeleteNode {

    public static LinkedList2 head;

    public static void insert(int data)
    {
        LinkedList2 ob = new LinkedList2(data);
        if (head == null)
        {
            head = ob;
        }
        else {
            LinkedList2 current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = ob;
        }
    }
    public static void display(LinkedList2 node)
    {
        while (node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
    public static void delete(LinkedList2 llist,int position)
    {
        if (position == 0)
        {
            llist = llist.next;
            head = llist;
        }
        else {
            LinkedList2 current = llist;
            int pos = 0;
            while (current.next != null)
            {
                pos = pos + 1;
                if (pos == position)
                {
                    current.next = current.next.next;
                }
                else {
                    current = current.next;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        display(head);
        delete(head,1);
        System.out.println("After deketeinvvdngkdgklfek");
        display(head);
    }
}
