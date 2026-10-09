class Student {
    String name;
    int rollNumber;
    double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else return 'D';
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 88.5);
        Student s2 = new Student("Bob", 102, 65.0);
        s1.displayInfo();
        s2.displayInfo();
    }
}