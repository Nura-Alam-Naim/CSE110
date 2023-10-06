import java.util.Scanner;

public class DSumming {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("ROW: ");
        int row = inp.nextInt();
        System.out.print("Collumn: ");
        int col = inp.nextInt();
        int sum = 0;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                arr[i][j] = inp.nextInt();
                sum += arr[i][j];
            }
        System.out.println();
        System.out.print("Total: " + sum + "\n");
        inp.close();

    }
}
