//        empty() – Returns whether the stack is empty – Time Complexity: O(1)
//        size() – Returns the size of the stack – Time Complexity: O(1)
//        top() / peek() – Returns a reference to the topmost element of the stack – Time Complexity: O(1)
//        push(a) – Inserts the element ‘a’ at the top of the stack – Time Complexity: O(1)
//        pop() – Deletes the topmost element of the stack – Time Complexity: O(1)

import java.util.Scanner;

class stack{
    int top;
    int arr[];
    stack(int n)
    {
        arr = new int[n];
        top  = -1;
    }
}

public class Stack_Array extends stack{
   Stack_Array(int n) {
    //stack(int n){
        super(n);
//        top = -1;
//        arr = new int[n];
    }

//    int top=-1;
//    int arr[];

    boolean IsEmpty()
    {
        if(top == -1)
            return true;
        return false;
    }

    int Size()
    {
        return top+1;
    }

    int Top()
    {
        return arr[top];
    }

    void push(int data)
    {
        if(top>arr.length-2)
        {
            System.out.println("Stack is full");
            return;
        }
        else {
            top = top+1;
            arr[top] = data;
        }

    }

    int Pop()
   {

     if(!IsEmpty())
     {
         int val = arr[top];
         top = top-1;
         return val;
     }
     return -1;

    }
    void display()
    {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements : ");
        int n = sc.nextInt();
        //stack ob = new stack(n);
        Stack_Array ob = new Stack_Array(n);
        for (int i = 0; i < n; i++) {
            ob.push(sc.nextInt());
        }
        ob.display();
        System.out.println("Top element " + ob.Top());
        System.out.println("Size of the stack " + ob.Size());
        System.out.println(ob.IsEmpty());
        System.out.println("push element : ");
        ob.push(sc.nextInt());
        ob.display();
        System.out.println("Deleted............."+ob.Pop());
        ob.display();
        System.out.println(ob.Size());

    }

}
