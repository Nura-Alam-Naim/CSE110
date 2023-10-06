import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("ROW: ");
        int row = inp.nextInt();
        System.out.print("Collumn: ");
        int col = inp.nextInt();

        int[][] arr = new int[row][col];
        int max = 0, r = 0;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int) (Math.random() * 50);
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    r = i + 1;
                }
            }

        System.out.println("OUTPUT: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("#Row " + r + " has the maximum value " + max + "\n");
        inp.close();

    }

}
