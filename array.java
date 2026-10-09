public class ArrayStats {
    public static void main(String[] args) {
        // Monthly sales for a year
        double[] sales = {12000, 15000, 11000, 18000, 22000, 19000, 25000, 21000, 17000, 16000, 23000, 27000};
        double max = sales[0], min = sales[0];
        for (double s : sales) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        System.out.println("Highest Sales: " + max + ", Lowest Sales: " + min);

        // Feedback ratings average
        int[] ratings = {5, 4, 3, 5, 4};
        int sum = 0;
        for (int r : ratings) sum += r;
        double avg = (double) sum / ratings.length;
        System.out.println("Average Feedback Rating: " + avg);
    }
}