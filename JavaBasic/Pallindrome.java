package JavaBasic;
public class Pallindrome {

    static public int rev(int num){
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num1 = 1111;
        int num = rev(num1);
        System.out.println(num);
        if(num == num1){
            System.out.println("number is pallindrome " + num);
        }else
            System.out.println("number is not pallindrome " + num);
    }
}
