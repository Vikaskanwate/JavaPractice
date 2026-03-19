public class pal{
    public static void main(String args[]){
        int num = 111;
        int save = num;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println(rev);

        if(rev == save)
            System.out.println("Number is pallindrome " + save);
        else
            System.out.println("Number is not pallindrome ");
    }
}