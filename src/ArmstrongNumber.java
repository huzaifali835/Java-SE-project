import java.util.Scanner;

public class ArmstrongNumber {
    public boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, n);
            number /= 10;
        }

        return result == originalNumber;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = scanner.nextInt();
        System.out.println("Is " + number + " an Armstrong number? " + isArmstrong(number));
    }
}