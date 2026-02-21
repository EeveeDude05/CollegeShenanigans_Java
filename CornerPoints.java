// (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point at the 0 o’clock position, as shown in Figure 4.4c. Write a program that prompts the user to enter the radius of the bounding circle of a pentagon and displays the coordinates of the five corner points on the pentagon from p1 to p5 in this order. Use console format to display two digits after the decimal point.

import java.util.Scanner;
public class CornerPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle of the pentagon: ");
        double radius = scanner.nextDouble();   
        double angleIncrement = 2 * Math.PI / 5; // 360 degrees divided by 5 points
        for (int i = 0; i < 5; i++) {
            double angle = i * angleIncrement; // Calculate the angle for each point
            double x = radius * Math.cos(angle); // Calculate x coordinate
            double y = radius * Math.sin(angle); // Calculate y coordinate
            System.out.printf("p%d: (%.2f, %.2f)%n", i + 1, x, y); // Display the coordinates
        }
        scanner.close();
    }
}
