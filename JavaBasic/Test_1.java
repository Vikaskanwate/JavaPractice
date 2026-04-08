package JavaBasic;

public class Test_1 {
    public static void main(String[] args) {
        String str = "Race car";
        String str1 = str.toLowerCase().replaceAll(" ","");
        
        // String rev = "";
        // for(int i = 0; i < str1.length(); i++){
        //     rev = str1.charAt(i) + rev;
        // }  
         
        boolean isPalindrome = false;
        int left = 0 , right = str1.length() - 1;

        while(left < right){
            if(str1.charAt(left) == str1.charAt(right)){
                isPalindrome = true;
                break;
            }
            left++;
            right--;
        }
        
        if(isPalindrome) 
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
