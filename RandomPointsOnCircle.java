// Write a program that generates three random points on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle formed by these three points, as shown in Figure 4.4. Display angles in degrees.

import java.util.Random;
public class RandomPointsOnCircle {
    public static void main(String[] args) {
        Random random = new Random();
        double radius = 40.0;

        // Generate three random angles in radians
        double angle1 = random.nextDouble() * 2 * Math.PI;
        double angle2 = random.nextDouble() * 2 * Math.PI;
        double angle3 = random.nextDouble() * 2 * Math.PI;

        // Calculate the coordinates of the three points on the circle
        double x1 = radius * Math.cos(angle1);
        double y1 = radius * Math.sin(angle1);
        double x2 = radius * Math.cos(angle2);
        double y2 = radius * Math.sin(angle2);
        double x3 = radius * Math.cos(angle3);
        double y3 = radius * Math.sin(angle3);

        // Calculate the lengths of the sides of the triangle
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        // Calculate the angles using the Law of Cosines
        double angleA = Math.acos((b*b + c*c - a*a) / (2*b*c)) * (180 / Math.PI);
        double angleB = Math.acos((a*a + c*c - b*b) / (2*a*c)) * (180 / Math.PI);
        double angleC = Math.acos((a*a + b*b - c*c) / (2*a*b)) * (180 / Math.PI);

        // Display the angles in degrees
        System.out.printf("Angle A: %.2f degrees%n", angleA);
        System.out.printf("Angle B: %.2f degrees%n", angleB);
        System.out.printf("Angle C: %.2f degrees%n", angleC);
    }
}
