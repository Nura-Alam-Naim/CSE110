
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int n = inp.nextInt();
        inp.nextLine();
        int[] score = new int[n];
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            arr[i] = inp.nextLine();
            System.out.print("Enter score: ");
            score[i] = inp.nextInt();
            inp.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            System.out.println(score[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (score[i] > score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;

                    String b = arr[i];
                    arr[i] = arr[j];
                    arr[j] = b;
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i] + " has scored " + score[i]);
        }
        // System.out.println();
        inp.close();
    }
}
