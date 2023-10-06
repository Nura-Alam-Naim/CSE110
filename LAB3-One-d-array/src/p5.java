public class p5 {
    static int max = 0;
    static int min = 101;

    public static void main(String[] args) {
        // Scanner inp= new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        int p = highstIndex(arr);
        int q = lowestIndex(arr);
        System.out.println(max + " is the Highest number and the index is: " + p);
        System.out.println(min + " is the Lowest number and the index is: " + q);
    }

    public static int highstIndex(int[] arr) {
        int index = 0;
        for (int i = 0; i < 100; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index + 1;
    }

    public static int lowestIndex(int[] arr) {
        int index = 0;
        for (int i = 0; i < 100; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index + 1;
    }

}
