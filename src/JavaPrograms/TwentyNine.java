package JavaPrograms;
import java.util.Scanner;

public class TwentyNine {

    static boolean ascending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean descending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to check if array is sorted");
        System.out.print("Please enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Please enter the elements:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Your array elements are: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        boolean asc = ascending(arr);
        boolean desc = descending(arr);

        if (asc || desc) {
            System.out.println("\nArray is sorted");
        } else {
            System.out.println("\nArray is unsorted");
        }

        sc.close();
    }
}
