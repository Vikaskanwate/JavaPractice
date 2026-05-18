package JavaBasic;

public class Test_35 {
    static boolean isPalindrome(String s,int start,int end){
        if(start >= end) return true;
        if(s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start+1, end-1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("mom", 0, 2));
    }
}
