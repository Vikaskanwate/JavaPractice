package JavaBasic;
// recursion reverse a string
public class Test_28 {
    static String reverse(String s){
        if(s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("vikas"));
    }    
}
