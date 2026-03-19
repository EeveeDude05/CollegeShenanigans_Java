import java.util.Random;

public class Odds {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] counts = new int[11]; // Index 0 is unused, indices 1-10 represent values 1-10

        for (int i = 0; i < 100000; i++) {
            int value = rand.nextInt(10) + 1; // Generate random value from 1 to 10
            counts[value]++;
        }

        displayData(counts);
    }

    public static void displayData(int[] data) {
        System.out.println("Value\tCount\tHistogram");
        System.out.println("-----\t-----\t---------");
        System.out.println("Each '*' (asterisk) represents 1,000 occurrences\n");

        for (int i = 1; i < data.length; i++) {
            int stars = data[i] / 1000; // Each * represents 1,000

            // Separate count from histogram for clearer output
            System.out.printf("%5d\t%5d\t", i, data[i]);
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}