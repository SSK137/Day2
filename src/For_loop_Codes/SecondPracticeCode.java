package For_loop_Codes;

public class SecondPracticeCode {
    public static void main(String[] args) {
        int number=231;
        int rmdr=0;
        int revrs=0;
        for(int i=1;i<=3;i++){
            rmdr=number%10;
            revrs=(revrs*10)+rmdr;
            number=number/10;
        }
        System.out.println(revrs);
    }
}
