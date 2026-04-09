package JavaBasic;

import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {     
        // String s = "aeiou";
        // String str = s.replaceAll(" ", "");
        // char ch [] = {'a','e','i','o','u','A','E','I','O','U'};
        // int vowelCount = 0;
        // int conCount = 0;
        // char str1[] = str.toCharArray();
        // for(int i = 0; i < str.length();i++){
        //     for(int j= 0; j < ch.length; j++){
        //         if(str1[i] == ch[j]){
        //             vowelCount += 1;
        //         }
        //     }
        // }
        // conCount=(str.length() - vowelCount);

        // System.out.println(vowelCount  +" " + conCount);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        String str = s.replaceAll(" ", "");
        char ch [] = str.toCharArray();
        int vowelCount = 0;
        int conCount = 0;
        for(char c : ch){
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c) != -1){
                    vowelCount++;
                }else{
                    conCount++;
                }
            }
        }
        System.out.println(vowelCount + " " + conCount);
    }
    
}
