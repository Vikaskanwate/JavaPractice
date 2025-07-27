package Array;

import java.util.*;
public class PrimeInArr {

    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0;i < num;i++){
            System.out.println("Enter the number");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i])){
                System.out.println(arr[i]  + " ");
                sum+= arr[i];
            }
        }
        System.out.println("Sum of prime numbers is "+sum);
    }
}
