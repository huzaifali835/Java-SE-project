import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("/nChoose an opearation");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Factorial");
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