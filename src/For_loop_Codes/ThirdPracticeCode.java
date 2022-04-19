package For_loop_Codes;

public class ThirdPracticeCode {
    int number=123;
    int num=number;
    int revrs=0;
    public void reverseint(){
        int rmdr = 0;
        for (int i = 1; i <= 3; i++) {
            rmdr = number % 10;
            revrs = (revrs * 10) + rmdr;
            number = number / 10;
        }

    }

    public void checkpalindrom(){
        if (num == revrs) {
            System.out.println("Number Is Palindrom");
        } else {
            System.out.println("Number is not Palindrom");
        }
    }

    public static void main(String[] args) {

        ThirdPracticeCode objthrd=new ThirdPracticeCode();
        objthrd.reverseint();
        objthrd.checkpalindrom();

    }
}
