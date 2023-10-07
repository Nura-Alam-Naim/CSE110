public class Shifting_elements {
    public static void main(String[] args) {
        // Scanner input= new Scanner(System.in);
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        for (int x : arr)
            System.out.print(x + " ");

        System.out.println();
        int[] shft = shifting(arr);

        for (int i = 0; i < shft.length; i++)
            System.out.print(arr[i] + " ");
        // input.close();
    }

    public static int[] shifting(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[arr.length - 1] = temp;

        return arr;
    }

}
