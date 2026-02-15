package JavaPrograms;
import java.util.Scanner;
public class Fourteen {

    static void fun(int number){
        int sum = 0;
        for (int i=1; i<=number; i+=2){
            sum += i;
        }
        System.out.printf("the sum of all odd numbers is : %d ", sum);
    }


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to summ all odd numbers from 1 to specified number N ");
        System.out.print("please enter the number: ");

        int number= sc.nextInt();
        fun(number);

    }
}
