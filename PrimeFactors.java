// This will propmpt the user for a positive integer and then display all of the prime factors of that number in decending order. 
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        System.out.println("Prime factors of " + number + " in descending order:");
        printPrimeFactorsDescending(number);
    }

    public static void printPrimeFactorsDescending(int n) {
        for (int i = n; i >= 2; i--) {
            while (n % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
     
}
