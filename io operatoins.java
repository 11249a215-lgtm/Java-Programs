import java.io.*;

public class IODemo {
    public static void main(String[] args) {
        // a) FileInputStream & FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("profile.txt")) {
            fos.write("Fitness User Profile Data".getBytes());
        } catch (IOException e) { e.printStackTrace(); }

        try (FileInputStream fis = new FileInputStream("profile.txt")) {
            int i;
            System.out.print("File content (Stream): ");
            while ((i = fis.read()) != -1) System.out.print((char) i);
            System.out.println();
        } catch (IOException e) { e.printStackTrace(); }

        // b) FileWriter & FileReader
        try (FileWriter fw = new FileWriter("editor.txt")) {
            fw.write("Text editor sample content.");
        } catch (IOException e) { e.printStackTrace(); }

        try (BufferedReader br = new BufferedReader(new FileReader("editor.txt"))) {
            System.out.println("File content (Reader): " + br.readLine());
        } catch (IOException e) { e.printStackTrace(); }
    }
}