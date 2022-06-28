package LinkedList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class LinkedList8{
    int data;
    LinkedList8 next;
    LinkedList8(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class Cycle_Detection {

    public static LinkedList8 Head;

    public static void insert(int data)
    {
        LinkedList8 ob = new LinkedList8(data);
        if (Head == null)
        {
            Head = ob;
        }
        else{
            LinkedList8 current = Head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = ob;
        }
    }
    public static void display(LinkedList8 head)
    {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static int CycleDetection(LinkedList8 head)
    {
//        LinkedList8 current = head;
//        while (current != null)
//        {
//            LinkedList8 temp = current.next;
//            while (temp != null)
//            {
//                if (temp == current)
//                {
//                    return 1;
//                }
//                temp = temp.next;
//            }
//            current = current.next;
//        }
//        return 0;
        Set<LinkedList8> set=new HashSet<>();
        while(head!=null){
            if(set.contains(head.next))
                return 1;
            set.add(head.next);
            head=head.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            insert(sc.nextInt());
        }
        display(Head);

        System.out.println(CycleDetection(Head));
    }
}
