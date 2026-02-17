package JavaPrograms;
import java.util.Arrays;

public class ThirteeThree {

    static void merging(int[] arr1, int[] arr2) {

        int[] newArr = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;


        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                newArr[k] = arr1[i];
                i++;
            } else {
                newArr[k] = arr2[j];
                j++;
            }
            k++;
        }


        while (i < arr1.length) {
            newArr[k++] = arr1[i++];
        }


        while (j < arr2.length) {
            newArr[k++] = arr2[j++];
        }

        System.out.println("Merged array: " + Arrays.toString(newArr));
    }

    public static void main(String[] args) {

        System.out.println("Welcome to merge two sorted arrays");

        int[] arr1 = {2, 3, 4, 6, 7};
        int[] arr2 = {9, 43, 53, 55, 111};

        merging(arr1, arr2);
    }
}

