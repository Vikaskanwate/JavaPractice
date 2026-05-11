package JavaBasic;
// recursion sum of digits
public class Test_27 {
    static int sumOfDigits(int n){
        if(n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        System.out.println("sum of digits is :"+sumOfDigits(454));
    }
}
