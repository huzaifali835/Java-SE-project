import java.util.Scanner;

public class SumOfDigits {
    public int sum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to get the sum of its digits:");
        int number = scanner.nextInt();
        System.out.println("Sum of digits of " + number + ": " + sum(number));
    }
}
