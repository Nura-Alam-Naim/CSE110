import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int n = inp.nextInt();
        System.out.print("Enter number of column: ");
        int m = inp.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = (int) (10 + Math.random() * 89);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter column number to sort: ");
        int col = inp.nextInt()-1;
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (a[i][col]>a[j][col]) {
                    int temp = a[i][col];
                    a[i][col]= a[j][col];
                    a[j][col] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        inp.close();
    }
}