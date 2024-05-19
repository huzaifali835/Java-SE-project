import java.util.Scanner;

public class FibonacciRecursive {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position to get the Fibonacci number:");
        int n = scanner.nextInt();
        System.out.println("Fibonacci number at position " + n + ": " + fibonacci(n));
    }
}
