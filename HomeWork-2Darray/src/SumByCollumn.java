import java.util.Scanner;

public class SumByCollumn {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("ROW: ");
        int row = inp.nextInt();
        System.out.print("Collumn: ");
        int col = inp.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] = inp.nextInt();

        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++)
                sum += arr[j][i];

            System.out.print("Sum of collumn " + (i + 1) + " : " + sum + "\n");
        }
        System.out.println();

        inp.close();

    }

}
