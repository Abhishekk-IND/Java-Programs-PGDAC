package JavaPrograms;

import org.w3c.dom.ls.LSOutput;

public class TwentyFive {
    public static void main(String[] args){
        System.out.println("welcome to print reverrse right half pyramid programm");
        for (int i=5; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
