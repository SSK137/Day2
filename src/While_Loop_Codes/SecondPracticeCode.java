package While_Loop_Codes;

public class SecondPracticeCode {

    public void reverseint() {
        int number = 231;
        int rmdr = 0;
        int revrs=0;

        while (number != 0) {
            rmdr = number % 10;
            revrs=(revrs*10)+rmdr;
            number = number / 10;

        }
        System.out.println(revrs);
    }
    public static void main(String[] args) {

        SecondPracticeCode spc = new SecondPracticeCode();
        spc.reverseint();
    }
}

