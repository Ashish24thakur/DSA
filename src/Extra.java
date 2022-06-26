import java.util.Scanner;

public class Extra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
