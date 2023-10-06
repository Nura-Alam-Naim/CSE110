//import java.util.Scanner;
public class Printing_arrays {
    public static void main(String[] args) {
        // Scanner input= new Scanner(System.in);
        int[] arr = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < arr.length; i++) {
            // int m=arr[i];
            post(arr[i]);
        }
    }

    public static void post(int x) {
        System.out.println(x);
    }
}
