import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Choose an opearation");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Factorial");
            System.out.println("3. Binary Search");
            System.out.println("4. GCD");
            System.out.println("5. LCM");
            System.out.println("6. Anagram Checker");
            System.out.println("7. Armstrong Number");
            System.out.println("8. Reverse of String");
            System.out.println("9. Fibonacci");
            System.out.println("10. Sum Of Digits");
            System.out.println("0. Exit");

            int userInput = scanner.nextInt();
            scanner.nextLine();
            switch(userInput){
                case 1:
                    new BubbleSort().run();
                    break;
                case 2:
                    new FactorialRecursive().run();
                    break;
                case 3:
                    new BinarySearch().run();
                    break;
                case 4:
                    new GCD().run();
                    break;
                case 5:
                    new LCM().run();
                    break;
                case 6:
                    new AnagramChecker().run();
                    break;
                case 7:
                    new ArmstrongNumber().run();
                    break;
                case 8:
                    new ReverseString().run();
                    break;
                case 9:
                    new FibonacciRecursive().run();
                    break;
                case 10:
                    new SumOfDigits().run();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}