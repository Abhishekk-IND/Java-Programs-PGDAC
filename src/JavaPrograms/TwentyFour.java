package JavaPrograms;
import org.w3c.dom.ls.LSOutput;

public class TwentyFour {

    public static void main(String[] args){
        System.out.println("welcome to print right half pyramid");
        for (int i =1; i<=5; i++){
            for (int j =1 ;j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
