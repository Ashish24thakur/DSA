package LinkedList;

import java.util.Scanner;

class LinkedKist7
{
    int data;
    LinkedKist7 next;
    LinkedKist7(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class Delete_duplicate_value_nodes_from_a_sorted_linked_list {

    public static LinkedKist7 Head;

    public static void insert(int data)
    {
        LinkedKist7 ob = new LinkedKist7(data);
        if (Head == null)
        {
            Head = ob;
        }
        else{
            LinkedKist7 current = Head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = ob;
        }

    }
    public static void display(LinkedKist7 head)
    {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void Remove_Duplicate(LinkedKist7 head)
    {
        LinkedKist7 current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        display(Head);
        Remove_Duplicate(Head);
        System.out.println("After removing duplicate.....................................");
        display(Head);
    }
}
