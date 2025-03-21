package Array;
public class PallindromNumber {
    public static void main(String[] args) {
        int num = 123,rem,rev = 0;
        int temp = num;
    
        while(num != 0){
            rem  = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if(rev == temp){
            System.out.println("number is pallindrom  " + temp);
        }else {
            System.out.println("number is not pallindrom " + temp);
        }

    }
}