package New.String;

public class StringPal {
    public static void main(String[] args) {
        
        String input = "vikas";
        String reversed = "";
        for(int i = input.length()-1; i >= 0; i--){
            reversed += input.charAt(i);
        }
        // System.out.print(reversed);
        if(reversed == input){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
