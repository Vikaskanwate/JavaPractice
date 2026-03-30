public class Palindrome{
    static boolean rev(int num){
        int temp = num;
        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return temp == rev;
    }
    public static void main(String args[]){
        if(rev(123)){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}