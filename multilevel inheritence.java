class StudentInfo {
    String name = "Alex";
}

class Marks extends StudentInfo {
    int[] subjects = {85, 90, 78, 88, 92};
}

class Result extends Marks {
    public void compute() {
        int total = 0;
        for (int m : subjects) total += m;
        double avg = (double) total / subjects.length;
        System.out.println("Student: " + name + " | Total: " + total + " | Average: " + avg);
    }
}

public class MultilevelTest {
    public static void main(String[] args) {
        Result r = new Result();
        r.compute();
    }
}