package JavaBasic;
// 🧩 Challenge 3: First Non-Repeating Character
// Problem:  
// Write a Java program to find the first non-repeating character in a given string. If all characters repeat, return "None".

// Examples / Test Cases:

// Input: "swiss" → Output: "w"

// Input: "aabbcc" → Output: "None"

// Input: "programming" → Output: "p"

// Input: "racecar" → Output: "e"

// Input: "xxyyzzq" → Output: "q"
public class Test_18 {
    public static void main(String[] args) {
        String s = "xxyyzzq";
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        } 
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i)-'a'] == 1){
                System.out.print(s.charAt(i));
                return;
            }
        }
        System.out.println("none");

    }
}
