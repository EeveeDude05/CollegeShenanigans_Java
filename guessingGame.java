
import java.util.Scanner;

// This is a guessing game where the user has to guess a random number between 1 and 10.

public class guessingGame {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 10) + 1; // Generate a random number between 1 and 10
        int userGuess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a random number between 1 and 10. Can you guess it?");

        try (Scanner input = new Scanner(System.in)) {
            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                userGuess = input.nextInt();

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the number!");
                }
            }
        }
    }
    
}
