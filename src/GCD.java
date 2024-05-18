import java.util.Scanner;

public class GCD {
    public int computeGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return computeGCD(b, a % b);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for GCD computation:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD of " + a + " and " + b + ": " + computeGCD(a, b));
    }
}
