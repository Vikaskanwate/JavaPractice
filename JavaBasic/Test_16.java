package JavaBasic;
public class Test_16 {
    static boolean isPalindrome(String s ){
       String s1 = new StringBuilder(s).reverse().toString();
       if(s1.equals(s)) return true;
       return false;
    }
    public static void main(String args[]){
        String s = "abcbab";
        if(s.length() == 1){
            System.out.println(s); 
            return;
        }
        int count = 0;
        int maxCount = 0;
        String longestString = "";
        for(int i = 0; i < s.length();i++){
            for(int j = i + 1; j <= s.length(); j++){
                String str = s.substring(i, j);
                if(isPalindrome(str)){
                    count = str.length();
                    if(count > maxCount){
                        maxCount = count;
                        longestString = str;
                    }
                }
            }
        }
        System.out.println(longestString);
    
    }
}
