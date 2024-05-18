import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public boolean isAnagram(String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings to check if they are anagrams:");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + isAnagram(s1, s2));
    }
}