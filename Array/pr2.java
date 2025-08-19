package Array;

public class pr2 {
    public static void main(String[] args) {
        // int num = 210;
        // int rev = 0;

        // while (num > 0) {
        // int digit = num % 10;
        // rev = rev * 10 + digit;
        // num = num / 10;
        // }

        // System.out.println("Reversed number: " + rev);
        // String number = "210";
        // String rev = "";
        // for(int i = number.length() - 1; i >= 0; i--){
        // rev += number.charAt(i);
        // }
        // System.out.println(rev);

        int num = 210;
        int rev = 0;
        int originalLength = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        String reversedStr = String.format("%0" + originalLength + "d", rev);
        System.out.println("Reversed with padding: " + reversedStr);
    }
}
