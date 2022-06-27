package LinkedList;

import java.util.Scanner;

class LinkedList5{
    int data;
    LinkedList5 next;
    LinkedList5(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Merge_two_sorted_linked_lists {

    public static LinkedList5 Head1, Head2;

    public static LinkedList5 insert(LinkedList5 head , int data)
    {
        LinkedList5 ob = new LinkedList5(data);
        if (head == null)
        {
            //head = ob;
            return ob;
        }
        else {
            LinkedList5 current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = ob;
        }
        return head;
    }
    public static void display(LinkedList5 head)
    {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static LinkedList5 ader(LinkedList5 head,LinkedList5 node)
    {
        if (head == null)
        {
            head = node;
            head.next = null;
            return head;
        }
        else {
            LinkedList5 temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
            temp.next.next = null;
        }
        return head;
    }

    // Merge two sorted kinked list in sorted manner

    public static LinkedList5 Merge(LinkedList5 head1, LinkedList5 head2)
    {
        LinkedList5 header = null;
        LinkedList5 current1 = head1;
        LinkedList5 current2 = head2;
        LinkedList5 present = null;
        while (current1 != null && current2 != null)
        {
            if (current1.data > current2.data) {
                // header = current2;
                present = current2;
                current2 = current2.next;
                header = ader(header, present);

            }
            else
            {
                present = current1;
                current1 = current1.next;
//                header = current1;
                header = ader(header, present);
                //current1 = current1.next;
            }
        }

//            if (header == null)
//            {
//                if (current1.data > current2.data) {
//                    header = current2;
//                    current2 = current2.next;
//                } else {
//                    header = current1;
//                    current1 = current1.next;
//                }
//            }
//            else {
//                LinkedList5 temp = header;
//                while (temp.next != null)
//                {
//                    temp = temp.next;
//                }
//                if (current1.data > current2.data)
//                {
//                    temp.next = current2;
//                    current2 = current2.next;
//                }
//                else
//                {
//                    temp.next = current1;
//                    current1 = current1.next;
//                }
//            }
//        }
            if (current1 != null) {
                while (current1 != null) {
                    present = current1;
                    current1 = current1.next;
                    header = ader(header, present);

                }
            }
            if (current2 != null) {
                while (current2 != null) {
                    present = current2;
                    current2 = current2.next;
                    header = ader(header, present);
                }
            }
        return header;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of test cases.................");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.println("Enter the length of first list : ");
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                Head1 = insert(Head1, sc.nextInt());
            }
            System.out.println("Enter the length of second list : ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Head2 = insert(Head2, sc.nextInt());
            }
            System.out.println("First list : ");
            display(Head1);
            System.out.println("Second list : ");
            display(Head2);
            LinkedList5 head = Merge(Head1, Head2);
            System.out.println(head.data);
            System.out.println("After merging...................................");
            display(head);
        }
        t=t-1;
    }
}
