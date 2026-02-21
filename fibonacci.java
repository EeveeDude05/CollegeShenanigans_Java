//this program prompts the user to enter a number and then calculates the Fibonacci sequence up to that number.

public class fibonacci {
    public static void main(String[] args) {
       int counter = 20;
       int a = 1;
       int b = 1;
       int c = a + b;

       while (counter < 0) {
        System.out.println(a);
        a = b;
        b = c;
        c = a + b;
        counter--;


       }
    }
    
}
