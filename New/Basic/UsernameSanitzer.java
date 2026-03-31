import java.util.Scanner;

public class UsernameSanitzer {
    private static final String DOMAIN = "@tcs.com";
    private static final int MIN_USRNAME_LENGTH = 8;
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine().trim().toLowerCase();

        // username must not be null 
        if(username == null || username.length() == 0){
            System.out.println("username cannot be empty.");
            return;
        }

        // username should not have digit at first index
        if(Character.isDigit(username.charAt(0))){
            System.out.println("Username should not start with a number.");
            return;
        }

        //username less than 16 and it must ends with @tcs.com
        if(username.length() < MIN_USRNAME_LENGTH + DOMAIN.length() || !username.endsWith(DOMAIN)){
            System.out.println("Username must contain at least " + MIN_USRNAME_LENGTH + " character before " + ".");
            return;
        }

        System.out.println("Username accepted");
        System.out.println("Sanitized Username: " + username);
    }
}
