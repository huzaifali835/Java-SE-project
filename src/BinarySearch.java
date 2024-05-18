import java.util.Scanner;

public class BinarySearch {
    public int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Not found
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers for Binary Search:");
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort(array);
        System.out.print("Sorted Array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Enter the number to search:");
        int target = scanner.nextInt();
        int result = search(sortedArray, target);
        if (result != -1) {
            System.out.println("Number found at index: " + result);
        } else {
            System.out.println("Number not found.");
        }
    }
}