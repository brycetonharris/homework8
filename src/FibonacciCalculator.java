import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the Fibonacci number
        int fibonacciNumber = fibonacci(number);

        // Print the result
        System.out.println("The Fibonacci number for " + number + " is " + fibonacciNumber);
        
        scanner.close();
    }

    // Method to calculate the Fibonacci number using recursion
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
