package collection;

import java.util.HashMap;

// 1. First Non-Repeating Character

// Problem:
// Given a string, find the first character that does not repeat.

// Input:  "aabccdeff"
// Output: 'b'


public class Test_04 {
    public static void main(String[] args) {

        String str = "aaccdeffb";

        HashMap<Character,Integer> freq = new HashMap<>();

        for(char ch : str.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);

        }        
        
        for(char ch : str.toCharArray()){
            if(freq.get(ch) == 1){
                System.out.println(ch);
                return;
            }
        }
    }    
}
