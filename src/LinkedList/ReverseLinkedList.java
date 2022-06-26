package LinkedList;

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
        LinkedList3 current = node;
        while (current.next != null)
        {
            LinkedList3 temp = current;
            temp.next = null;
            temp.next = current;
//            current.next = null;
        }
    }
}
