package New.Basic;
import java.util.*;
public class A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");

        int number = sc.nextInt();

        System.out.println("You entered: " + number);

        sc.close();
    }
}