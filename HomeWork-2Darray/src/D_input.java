import java.util.Scanner;

public class D_input {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ROW: ");
    int row = input.nextInt();
    System.out.print("Collumn: ");
    int col = input.nextInt();

    int[][] arr = new int[row][col];
    for (int i = 0; i < row; i++)
      for (int j = 0; j < col; j++)
        arr[i][j] = input.nextInt();

    System.out.println();
    System.out.println("OUTPUT: ");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++)
        System.out.print(arr[i][j] + " ");

      System.out.println();
    }
    input.close();
  }

}
