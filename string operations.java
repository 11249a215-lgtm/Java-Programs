import java.util.Arrays;

public class StringAndArrayApp {
    public static void main(String[] args) {
        // String Operations: Department comparison
        String emp1Dept = "Engineering";
        String emp2Dept = "Engineering";
        if (emp1Dept.equalsIgnoreCase(emp2Dept)) {
            System.out.println("Both employees work in the same department.");
        } else {
            System.out.println("Different departments.");
        }

        // Library System: 10 books, filter starting with 'A'
        String[] books = {"Algorithms", "Database", "Advanced Java", "Networking", "AI Basics", 
                          "Operating Systems", "Architecture", "Calculus", "Physics", "Chemistry"};
        System.out.println("\nBooks starting with 'A':");
        for (String book : books) {
            if (book.startsWith("A")) {
                System.out.println(book);
            }
        }
    }
}