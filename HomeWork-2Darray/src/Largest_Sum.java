import java.util.Scanner;

public class Largest_Sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("ROW: ");
        int row = inp.nextInt();
        System.out.print("Collumn: ");
        int col = inp.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = (int) (Math.random() * 50);

        System.out.println("OUTPUT: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
        int maxrow = maxsum(arr, row, col);
        System.out.print("#Row " + maxrow + " has the maximum sum.\n");
        inp.close();

    }

    public static int maxsum(int[][] arr, int row, int col) {
        int maxrow = 0;
        int max = 0;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            if (sum > max)
                maxrow = i;
        }
        return maxrow + 1;
    }

}
