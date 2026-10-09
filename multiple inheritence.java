interface Printable {
    void print();
}

interface Showable {
    void show();
}

class ReportCard implements Printable, Showable {
    public void print() { System.out.println("Printing report card..."); }
    public void show() { System.out.println("Showing report card details..."); }
}

public class InterfaceTest {
    public static void main(String[] args) {
        ReportCard rc = new ReportCard();
        rc.print();
        rc.show();
    }
}