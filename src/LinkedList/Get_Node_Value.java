package LinkedList;

import java.util.Scanner;

class LinkedList6{
    int data;
    LinkedList6 next;
    LinkedList6(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class Get_Node_Value {

    public static LinkedList6 Head;

    public static void insert(int data)
    {
        LinkedList6 ob = new LinkedList6(data);
        if (Head == null)
        {
            Head = ob;
        }
        else {
            LinkedList6 current = Head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = ob;
        }
    }
    public static void display(LinkedList6 head)
    {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static int len(LinkedList6 head)
    {
        int sum = 0;
        while (head != null)
        {
            sum += 1;
            head = head.next;
        }
        return sum;
    }
    public static int find(LinkedList6 head, int pos)
    {
        int p = 0;
        int l = len(head);

        while (head != null)
        {
            p = p+1;
            if (p == (l-pos))
            {
                return head.data;
            }
            head = head.next;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        System.out.println("display....................................");
        display(Head);
        System.out.println("Enter the position : .......................");
        int pos = sc.nextInt();
        System.out.println(find(Head,pos));
    }
}

//1   2    3    4       5
//4   3    2     1      0