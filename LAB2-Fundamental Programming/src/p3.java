import java.util.Scanner;

public class p3 {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        Double a = inp.nextDouble();
        inp.nextLine();
        Double b = inp.nextDouble();
        inp.nextLine();
        Double c = inp.nextDouble();
        inp.nextLine();

        double descriminant = (Math.pow(b, 2)) - (4 * a * c);
        if (descriminant == 0) {
            Double r = (-1 * b) / (2 * a);
            System.out.print("This equation has one root " + r);
        } else if (descriminant > 0) {
            Double r1 = (Math.sqrt(descriminant) - b) / (2 * a);
            Double r2 = (Math.sqrt(descriminant) + b) / (2 * a);
            System.out.print("This equation has two roots " + r1 + " and " + r2);
        } else
            System.out.print("The equation has no real root");

        inp.close();
    }
}
