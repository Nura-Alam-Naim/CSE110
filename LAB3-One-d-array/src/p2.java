import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[102];
        System.out.print("Enter the integers between 1 to 100: ");
        int n;
        while (true) {
            n = inp.nextInt();
            if (n == 0)
                break;
            arr[n]++;
        }
        for (int i = 0; i < 101; i++) {
            if (arr[i] > 0) {
                if (arr[i] > 1)
                    System.out.println(i + " occours " + arr[i] + " times");
                else if (arr[i] == 1)
                    System.out.println(i + " occours " + arr[i] + " time");
            }
        }
        inp.close();

    }
}
