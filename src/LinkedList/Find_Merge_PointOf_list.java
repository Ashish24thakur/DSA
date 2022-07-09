//package LinkedList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class LinkedLit10
//{
//    int data;
//    LinkedLit10 next;
//    LinkedLit10(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//
//
//public class Find_Merge_PointOf_list {
//
//    public static void Find_Merge_point(LinkedLit10 head1, LinkedLit10 head2)
//    {
//        List<LinkedLit10> list = new ArrayList<>();
//
//        LinkedLit10 current1 = head1;
//        LinkedLit10 current2 = head2;
//
//        while (current1 != null)
//        {
//            list.add(current1);
//            current1 = current1.next;
//        }
//
//        while (current2 != null)
//        {
//            if(list.contains(current2))
//            {
//                break;
//            }
//            list.add(current2);
//            current2 = current2.next;
//        }
//        System.out.println(current2.data);
//
//
//    }
//}
