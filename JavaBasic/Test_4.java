package JavaBasic;

import java.util.Arrays;

public class Test_4 {

    public static boolean chk_anagram(String str , String str1){
        String s = str.toLowerCase().replaceAll(" ", "");
        String s1  = str1.toLowerCase().replaceAll(" ", "");
        if(s.length() != s1.length()){
            return false;
        }
        char ch [] = s.toCharArray();
        char ch1 [] = s1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        int j = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ch1[j]){
                j++;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean flag = chk_anagram("SILENT","LISTEN");
        // boolean flag = chk_anagram("hello", "world");
        // boolean flag = chk_anagram("race", "care");
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
