package JavaBasic;
// recursive palindrome
public class Test_29 {
    static boolean isPalindrome(String s, int start , int end){
        if(start >= end) return true;
        if(s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s,start+1,end-1);
    }
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(isPalindrome(str,0,str.length()-1));
    }
}
