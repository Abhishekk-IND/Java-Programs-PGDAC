package JavaPrograms;
import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to find number is positive, negetive, zero");

        System.out.print("please enter the number with sign= ");
        int number= sc.nextInt();
        if (number >0){
            System.out.print("your number is posttive");

        } else if (number<0){
            System.out.println("your number is negative");
        } else if (number ==0){
            System.out.println("your number is zero");
        }

    }
}
