package JavaPrograms;
import java.util.Scanner;
public class Twelve {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to check given number is even or odd with bitwise operator");

        System.out.print("please enter the first number: ");
        int first= sc.nextInt();
        int num = 1;
        if ((first & num) ==1){
            System.out.printf("given number %d is odd ", first);
        } else{
            System.out.printf("given number %d is even", first);
        }



    }
}
