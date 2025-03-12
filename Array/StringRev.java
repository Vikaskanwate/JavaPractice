package Array;
public class StringRev{
    
    public static void main(String[] args) {
        String str = "Ramesh";
        String rev = "";
        for(int i = 0; i < str.length(); i++){
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);
    }
}