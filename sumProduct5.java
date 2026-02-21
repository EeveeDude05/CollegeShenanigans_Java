//Aiden Volf
//2-21-26

// This code is an extension of sum1_Thru10.java and will determine the product "*x =++;" after calulations are performed and the inital value is an int value of 5.


public class sumProduct5 {
    public static void main(String[] args) {
        int sum = 0; // Declare product and initialize it to 1
        int x = 1;   // Declare x and initialize it to 5
        int product = 5; // Declare product and initialize it to 1

        while (x <= 10) {
            sum += x;    // Add x to sum and assign the result to sum
            x++;         // Increment x
        }
        product *= sum;    // Multiply product by sum and assign the result to product


        System.out.println("The value of sum is: " + sum); // Print the value of sum
        System.out.println("The value of product is: " + product); // Print the value of product
    }
}