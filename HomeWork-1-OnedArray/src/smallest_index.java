public class smallest_index {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = (int) Math.ceil(Math.random() * 500);
        for (int x : arr)
            System.out.print(x + " ");

        System.out.println();
        int mx = Max(arr);
        System.out.println("Maximum number: " + mx);

        int small = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == mx)
                small = i + 1;
        System.out.println("Index of Maximum number: " + small);

    }

    public static int Max(int[] arr) {
        int maximum = 0;
        for (int x : arr)
            if (x > maximum)
                maximum = x;
        return maximum;
    }
}
