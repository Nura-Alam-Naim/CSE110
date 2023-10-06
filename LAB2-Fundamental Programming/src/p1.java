import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if (number % 3 == 0 && number % 2 == 0)
            System.out.print("FALSE");
        else if (number % 2 == 0)
            System.out.print("TRUE");
        else if (number % 3 == 0)
            System.out.print("TRUE");
        else
            System.out.print("FALSE");

        scn.close();
    }

}
