import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException
        String[] trainCodes = {"TR101", "TR102", "TR103"};
        try {
            System.out.println("Accessing train: " + trainCodes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Index out of bounds!");
        }

        // Predefined exceptions (Arithmetic & NumberFormat)
        try {
            int age = Integer.parseInt("abc"); // NumberFormatException
            int val = 10 / 0; // ArithmeticException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException while reading input.");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException.");
        }
    }
}