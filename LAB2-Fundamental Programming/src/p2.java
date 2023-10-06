import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter numver of minutes: ");
        long min = inp.nextLong();
        long dy = min / 1440;
        long yr = dy / 365;
        long day = dy % 365;
        System.out.print(min + " minutes is approximately " + yr + " years and " + day + " days");
    }

}
