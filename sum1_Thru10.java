//Aiden Volf
//2-21-26

// This code is an extension of sumAdd.java and will calculate the sum of the integers from 1 to 10 using a while loop.

public class sum1_Thru10 {
    public static void main(String[] args) {
        int sum = 0; // Declare sum and initialize it to 0
        int x = 1;   // Declare x and initialize it to 1

        while (x <= 10) {
            sum += x;    // Add x to sum and assign the result to sum
            x++;         // Increment x
        }

        System.out.println("The value of sum is: " + sum); // Print the value of sum
    }
}