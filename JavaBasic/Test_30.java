package JavaBasic;
// recursion Factorial of a Number 
public class Test_30 {

    static int sumFactorialOfNumber(int n){
        if(n == 0) return 1;
        return n * sumFactorialOfNumber(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumFactorialOfNumber(5));
    }
}
