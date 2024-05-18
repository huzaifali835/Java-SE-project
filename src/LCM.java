import java.util.Scanner;

public class LCM {
    public int computeLCM(int a, int b) {
        GCD gcd = new GCD();
        return (a * b) / gcd.computeGCD(a, b);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for LCM computation:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("LCM of " + a + " and " + b + ": " + computeLCM(a, b));
    }
}