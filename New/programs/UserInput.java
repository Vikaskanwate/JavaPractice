import java.util.*;
public class UserInput{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");

            int number = sc.nextInt();
            System.out.println("You entered: "+ number);
        }
    }
}