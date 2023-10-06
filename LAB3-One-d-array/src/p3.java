import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] check = new int[100];
        int o = 0;
        while (n > 0) {
            int r = n % 10;
            check[o] = r;
            o++;
            n /= 10;
        }
        boolean f = true;
        for (int i = 0; i < o / 2; i++) {
            if (check[i] == check[o - 1 - i])
                f = true;
            else {
                f = false;
                break;
            }
        }
        if (f)
            System.out.println("Palindrom");
        else
            System.out.println(" Not Palindrom");
        inp.close();

    }
}
