import java.util.Scanner;

public class name_department {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();// input.next()
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Enter you CGPA: ");
        Double cgpa = input.nextDouble();
        System.out.println("Enter your department: ");
        input.nextLine();
        String department = input.nextLine();

        System.out.printf("Your Name: %s\n", name);
        System.out.printf("Your Age: %d\n", age);
        System.out.printf("Your CGPA: %.2f\n", cgpa);
        System.out.printf("Your Department: %s\n", department);
        input.close();
    }
}