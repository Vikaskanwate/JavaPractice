import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = a + b;

            System.out.println("sum of a and b  is " + sum);
        }
    }
}
