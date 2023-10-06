import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int n = inp.nextInt();
        int h = 0;
        System.out.print("Enter " + n + " scores: ");
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = inp.nextInt();
            if (score[i] > h)
                h = score[i];
        }
        inp.close();
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + i + " score is " + score[i] + " and grade is ");
            if (score[i] >= h - 10)
                System.out.print("A");
            else if (score[i] >= h - 20)
                System.out.print("B");
            else if (score[i] >= h - 30)
                System.out.print("C");
            else if (score[i] >= h - 40)
                System.out.print("D");
            else
                System.out.print("F");
            System.out.println();
        }

    }

}
