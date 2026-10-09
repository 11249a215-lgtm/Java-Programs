import java.util.Scanner;

public class ControlStatementsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for control statement demo: ");
        int num = sc.nextInt();

        // a) if-else & selection
        if (num > 0) {
            System.out.println(num + " is Positive.");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println("Number is Zero.");
        }

        // c) switch statement
        System.out.print("Enter a day number (1-3): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }

        // Looping statements
        System.out.println("For loop (1 to 3):");
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}