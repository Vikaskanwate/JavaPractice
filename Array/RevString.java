package Array;

public class RevString {
    public static void main(String[] args) {
        String name = "prathamesh";
        String rev = "";
        for(int i = 0; i < name.length();i++){
            rev = name.charAt(i) + rev;
        }
        System.out.println(rev);
        
    }
}
