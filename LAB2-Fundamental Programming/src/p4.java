import java.util.Scanner;

public class p4 {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        System.out.println("#Enter \"0\" to convert USA to BDT");
        System.out.println("#Enter \"1\" to convert BDT to USA");
        int choice = inp.nextInt();
        if (choice == 0) {
            System.out.print("USD:");
            Double usd = inp.nextDouble();
            System.out.printf("BDT: %.5f", usd * 103.93);
        }
        if (choice == 1) {
            System.out.print("BDT:");
            Double bdt = inp.nextDouble();
            System.out.printf("USD: %.5f", bdt / 103.93);
        }
        inp.close();
    }

}
