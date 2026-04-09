package JavaBasic;

import java.util.Scanner;

public class Test_2 {
    public static int sumOfDigit(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10; 
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(sumOfDigit(num));
    }
}
