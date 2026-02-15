package JavaPrograms;
import java.util.Scanner;
public class Ten {
    public static void main(String[] args) {
        System.out.println("welcome to shows bitwise AND of two numbers");
        Scanner sc= new Scanner(System.in);

        System.out.print("please enter the first number= ");
        int first= sc.nextInt();

        System.out.print("please enter the second number= ");
        int second= sc.nextInt();

        int result = first & second;
        System.out.printf("bitwise AND of %d and %d is %d", first , second, result);



    }
}
