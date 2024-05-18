import java.util.Scanner;

public class ReverseString {
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String originalString = scanner.nextLine();
        System.out.println("Reversed string of \"" + originalString + "\": " + reverse(originalString));
    }
}