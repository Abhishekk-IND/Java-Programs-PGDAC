package JavaPrograms;
import java.util.Scanner;
import java.util.Arrays;

public class ThirteeOne {

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to print reverse of an array");
        System.out.print("Please enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Please enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter %d th index element: ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed array is: " + Arrays.toString(arr));
    }
}
