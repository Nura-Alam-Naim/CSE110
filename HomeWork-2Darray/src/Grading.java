public class Grading {
    public static void main(String[] args) {
        // Scanner inp= new Scanner(System.in);
        char[] ans = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
        char[][] std = new char[8][10];
        for (int i = 0; i < std.length; i++)
            for (int j = 0; j < std[i].length; j++) {
                int a = (int) ((Math.random() * 5) + 65);
                char c = (char) a;
                std[i][j] = c;
            }
        for (int i = 0; i < std.length; i++) {
            for (int j = 0; j < std[i].length; j++) {
                System.out.print(std[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Correct answers: \n");

        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
        System.out.println();
        for (int i = 0; i < std.length; i++) {
            int crr = 0;
            for (int j = 0; j < 8; j++) {
                if (std[i][j] == ans[j])
                    crr++;
            }
            System.out.print("#Student " + (i + 1) + " has given " + crr + " correct answers\n");
        }

    }
}
