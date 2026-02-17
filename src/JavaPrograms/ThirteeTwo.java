package JavaPrograms;
import java.util.Scanner;
import java.util.Arrays;

public class ThirteeTwo {

    static void isPalindrome(int[] arr){
        int[] arr2= new int[arr.length];
        for (int i=arr.length-1,j=0; i>=0; i--){
            arr2[j]=arr[i];
            j++;
        }
        System.out.println("your reveresed array: "+Arrays.toString(arr2));
        if (Arrays.equals(arr,arr2)){
            System.out.println("your array is palindrome");
        }else {
            System.out.println("array is not palindrome");
        }

    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to check array is palindrome or not");
        System.out.print("please enter the size of array: ");
        int size= sc.nextInt();
        int[] arr= new int[size];

        System.out.println("please enter the elements: ");
        for (int i=0; i<arr.length; i++){
            System.out.printf("enter the %d th index element: ", i);
            arr[i]= sc.nextInt();

        }
        System.out.println("your array elements are: "+ Arrays.toString(arr));

        isPalindrome(arr);
    }
}
