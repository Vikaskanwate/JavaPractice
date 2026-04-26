package JavaBasic;
// 🧩 Challenge 5: Longest Substring Without Repeating Characters
// Problem:  
// Write a Java program to find both the length and the actual substring of the longest substring without repeating characters.

// Examples / Test Cases:

// Input: "abcabcbb" → Output: "abc", length = 3

// Input: "bbbbb" → Output: "b", length = 1

// Input: "pwwkew" → Output: "wke", length = 3

// Input: "abcdef" → Output: "abcdef", length = 6

// Input: "abcannd" → Output: "bcan" or "cand", length = 4
public class Test_19 {
    public static void main(String[] args) {
        String s = "pwwkew";
        String longest = "";
        int maxLen= 0, left = 0;
        int freq[] = new int[26];
        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'a']++;
            
            while (freq[s.charAt(right) - 'a'] > 1) {
                freq[s.charAt(left)-'a']--;
                left++;
                
            }
            // maxLen = Math.max(maxLen,right - left + 1);
            if(right - left + 1 > maxLen){
                maxLen = right - left +1;
                longest = s.substring(left,right +1);
            }
            
        }
        System.out.println(maxLen  + " " + longest);
    }
}
