package JavaPrograms;
import java.util.Scanner;

class Eighteen{
    static void fun(int first, int second){
        for (int i =1; true; i++){
            int factor = first * i;

            if (factor % second ==0){
                System.out.println("your LCM is  : "+ factor);
                break;
            }

        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to find LCM: ");
        System.out.print("please enter the first number: ");
        int first= sc.nextInt();

        System.out.print("please enter the second number: ");
        int second = sc.nextInt();

        fun(first, second);


    }

}