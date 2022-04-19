package Switch_Codes;
import java.util.*;
public class FirstPracticeCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vowel");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
                System.out.println(ch + " is vowel");
                break;
            case 'e':
                System.out.println(ch + " is vowel");
                break;
            case 'i':
                System.out.println(ch + " is vowel");
                break;
            case 'o':
                System.out.println(ch + " is vowel");
                break;
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
