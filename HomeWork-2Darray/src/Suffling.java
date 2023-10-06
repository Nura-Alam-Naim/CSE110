import java.util.Scanner;

public class Suffling {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("ROW: ");
        int row = inp.nextInt();
        System.out.print("Collumn: ");
        int col = inp.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] = (int) (Math.random() * 50);

        System.out.println("Inputs: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int r = (int) (Math.random() * arr.length);
                int c = (int) (Math.random() * arr[i].length);
                int temp = arr[i][j];
                arr[i][j] = arr[r][c];
                arr[r][c] = temp;
            }
        }
        System.out.println("Output: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        inp.close();
    }

}
