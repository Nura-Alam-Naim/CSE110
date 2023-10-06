public class shuffling {
    public static void main(String[] args) {
        // Scanner input= new Scanner(System.in);
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        for (int x : arr)
            System.out.print(x + " ");

        int[] suff = suffle(arr);
        System.out.println();
        for (int y : suff)
            System.out.print(y + " ");
    }

    public static int[] suffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int change = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[change];
            arr[change] = temp;
        }
        return arr;
    }

}
