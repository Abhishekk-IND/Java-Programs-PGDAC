package JavaPrograms;
import java.util.Scanner;

public class ThirteeSeven {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }
        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to check string palindrome or not program ");
        System.out.print("please enter the String: ");
        String str= sc.nextLine();
        System.out.println("Your string is "
                + ((isPalindrome(str) ? "Palindrome"
                : "Not Palindrome")));
    }
}
