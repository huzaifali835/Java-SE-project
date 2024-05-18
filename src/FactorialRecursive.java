import java.util.Scanner;

public class FactorialRecursive {
    public int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to compute its factorial:");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + ": " + factorial(number));
    }
}
