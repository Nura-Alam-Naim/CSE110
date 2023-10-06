import java.util.Scanner;

public class p5 {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the center of circle(p,q): ");
        int p = inp.nextInt();
        int q = inp.nextInt();
        System.out.print("Enter the radius(r): ");
        int r = inp.nextInt();
        System.out.println("Enter the point (x,y): ");
        int x = inp.nextInt();
        int y = inp.nextInt();
        double res = Math.sqrt((Math.pow(p, 2) - Math.pow(x, 2)) + (Math.pow(q, 2) - Math.pow(y, 2)));

        if (res < r)
            System.out.println("The point is within the circle");
        else
            System.out.println("The point is outside the circle");

        inp.close();

    }
}