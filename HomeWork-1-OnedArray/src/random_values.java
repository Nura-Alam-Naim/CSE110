public class random_values {
    public static void main(String[] args) {
        // Scanner input= new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++)
            arr[i] = Math.random() * 100;

        for (double x : arr)
            System.out.println(x);
    }

}
