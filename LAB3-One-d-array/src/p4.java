import java.util.Scanner;

public class p4 {
    static int[] arr = new int[10];

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = inp.nextInt();
        }
        placed();
        for (int i = 0; i < 10; i++) {
            int h = IsDistinct(i);
            if (h == 0)
                continue;
            else
                System.out.print(arr[i] + " ");
        }
        inp.close();
    }

    public static void placed() {
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }
    }

    public static int IsDistinct(int i) {
        int f = 1;
        if (arr[i] == -1)
            f = 0;
        return f;
    }
}
