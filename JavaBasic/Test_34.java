package JavaBasic;
// reverse String 
// Base case: empty string.
// Recursive case: reverse the rest, then append first char.

public class Test_34 {

    static String reverse(String s){
        if(s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse("vikas"));
    }
}
