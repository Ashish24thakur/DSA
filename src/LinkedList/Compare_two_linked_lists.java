package LinkedList;

import java.util.Scanner;

class LinkedList4{
    int data;
    LinkedList4 next;
    LinkedList4(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class Compare_two_linked_lists {
    public static LinkedList4 Head1, Head2;

    public static void insert1(LinkedList4 head,int data)
    {
        LinkedList4 ob = new LinkedList4(data);
        if (head == null)
        {
            Head1 = ob;
        }
        else {
            LinkedList4 current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = ob;
        }
    }
    public static void insert2(LinkedList4 head,int dat)
    {
        LinkedList4 ob = new LinkedList4(dat);
        if (head == null)
        {
            Head2 = ob;
        }
        else {
            LinkedList4 current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = ob;
        }
    }
    public static void display(LinkedList4 head)
    {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void Compare(LinkedList4 head1, LinkedList4 head2)
    {
        int lenl1=0;
        int lenl2 = 0;
        LinkedList4 current1 = head1;
        LinkedList4 current2 = head2;
        while (current1 != null)
        {
            lenl1 += 1;
            current1 = current1.next;
        }
        while (current2 != null)
        {
            lenl2 += 1;
            current2 = current2.next;
        }
        if (lenl1 == lenl2)
        {
            int f=0;
            while (head1 != null && head2 != null)
            {
                if (head1.data != head2.data)
                {
                    f=1;
                    break;
                }
                head1 = head1.next;
                head2 = head2.next;
            }
            if (f==0)
            {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
        else {
            System.out.println("0");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test case : ");
        int t = sc.nextInt();
        while (t>0) {
            Head1 = null;
            Head2 = null;
            System.out.println("Enter the first list length : ");
            int m = sc.nextInt();
            System.out.println("Enter first list ");
            for (int i = 0; i < m; i++) {
                insert1(Head1, sc.nextInt());
            }
            System.out.println("Enter second list length : ");
            int n = sc.nextInt();
            System.out.println("Enter second list : ");
            for (int i = 0; i < n; i++) {
                insert2(Head2, sc.nextInt());
            }
//        display(Head1);
//        System.out.println("Second");
//        display(Head2);
            Compare(Head1, Head2);
        }
    }
}
