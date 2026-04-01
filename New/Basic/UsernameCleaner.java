import java.util.Scanner;

public class UsernameCleaner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String username = sc.nextLine();
            System.out.println(username.length());
            if(username.length() < 5){
                System.out.println("Invalid Input");
                return;
            }

            StringBuilder cleaned = new StringBuilder();

            for(int i = 0; i < username.length(); i++){
                char ch = username.charAt(i);
                //checking if character not is letter or digit 
                if(!Character.isLetterOrDigit(ch)){
                    System.out.println("Invalid Input");
                    return;
                }
                // after that append value in string buffer 
                cleaned.append(Character.toUpperCase(ch));
            }
            System.out.println(cleaned.toString());
        }
    }
}
