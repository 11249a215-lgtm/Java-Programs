class Employee {
    int empId;
    String name;
    double basicSalary;

    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class PermanentEmployee extends Employee {
    double hra, da;

    public PermanentEmployee(int empId, String name, double basicSalary, double hra, double da) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    public double calculateGross() {
        return basicSalary + hra + da;
    }

    public void display() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Gross Salary: " + calculateGross());
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        PermanentEmployee pe = new PermanentEmployee(1, "John", 40000, 5000, 3000);
        pe.display();
    }
}