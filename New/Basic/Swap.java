import java.util.Scanner;

class D{
    static void swap(int a,int b){
        System.out.println("Before swapping a = "+a +" and b = "+b);
        int t;
        // t = a;
        // a = b;
        // b = t;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a = "+a + "and b = "+b);
    }
}

public class Swap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            D.swap(a,b);
        }
        
    }


}
