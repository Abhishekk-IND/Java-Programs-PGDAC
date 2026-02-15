package JavaPrograms;
import java.util.Scanner;

public class Seventeen {
    static int  fun(int first, int second){
        int gcd=1;
        int min= minimum(first, second);
        int i =2;
        while(i <=min){
            if (first % i ==0 && second % i ==0 ){
                gcd=i;
            } i++;
        }
        return gcd;
    }
    static int minimum(int first, int second ){
        if (first > second){
            return second;
        } else {
            return first;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to GCD/HCF");
        System.out.print("enter the first number: ");
        int first = sc.nextInt();
        System.out.print("enter the second number: ");
        int second = sc.nextInt();

        int result = fun(first, second);
        System.out.println("the GCD of two numbers is : "+ result);
    }
}
