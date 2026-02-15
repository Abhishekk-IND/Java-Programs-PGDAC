package JavaPrograms;
import java.util.Scanner;
public class Fifteen {

    static void fun(int number){
        long total=1;
        for(int i=1; i<=number; i++){
            total *=i;
        }
        System.out.println("the factorial of this "+number+ " is" + total );

    }



    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);

        System.out.println("welcome to factorieal programm with the help of loops");
        System.out.print("please enter the number= ");
        int number= sc.nextInt();
        if (number < 0){
            System.out.print("negative number is not allowed ");
        } else fun(number);

    }
}
