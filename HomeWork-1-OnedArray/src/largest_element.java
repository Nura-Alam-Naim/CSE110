public class largest_element {
    public static void main(String[] args) {
        // Scanner input= new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = (int) Math.ceil(Math.random() * 500);
        for (int x : arr)
            System.out.println(x);
        int mx = Max(arr);
        System.out.println("Maximum number: " + mx);
    }

    public static int Max(int[] arr) {
        int maximum = 0;
        for (int x : arr)
            if (x > maximum)
                maximum = x;
        return maximum;
    }

}
