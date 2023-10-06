import java.util.Scanner;

public class Problem2 {
        public static void main(String[] args) {
                Scanner inp = new Scanner(System.in);
                System.out.println("Enter password: ");
                String pass = inp.nextLine();
                boolean ok = true;
                int cnt = 0;
                if (pass.length() < 8 || pass.length() > 8)
                        ok = false;
                for (int i = 0; i < pass.length(); i++) {
                        char ch = pass.charAt(i);
                        if (ch >= '0' && ch <= '9')
                                cnt++;
                        if (Character.toUpperCase(ch)>='A' && Character.toUpperCase(ch)<='Z' || ch>='0' && ch<='9')
                                ok=true;
                        else
                        {
                                ok = false;
                                break;
                        }
                }
                if (cnt < 2)
                        ok = false;

                if (!ok)
                        System.out.println("Password is invalid");
                else
                        System.out.println("Password is valid");
        }
}