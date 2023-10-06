//import java.util.Scanner;
public class Summing {
    public static void main(String[] args) {
        // Scanner input= new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = (int) Math.ceil(Math.random() * 500);
        for (int x : arr)
            System.out.println(x);
        int s = sum(arr);
        System.out.println("SUM of the numbers: " + s);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr)
            sum += x;
        return sum;
    }

}
