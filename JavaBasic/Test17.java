// 🧩 Challenge: Sentence Transformer & Analyzer
// Problem:  
// Write a Java program that takes a sentence and performs the following transformations using only string concepts:

// Remove leading/trailing spaces.

// Convert the sentence to lowercase.

// Capitalize the first letter of each word.

// Remove duplicate words (case‑insensitive).

// Count the number of vowels and consonants in the final cleaned sentence.

// Find the longest word in the sentence.
package JavaBasic;

public class Test17 {
    public static void main(String[] args) {
        String s = " Java is IS fun FUN ";
        String str [] = s.trim().toLowerCase().split(" ");
        String concatedString = "";
        for(int i = 0; i < str.length; i++){
            concatedString = str[i].substring(0,1).toUpperCase().concat(str[i].substring(1));
            System.out.println(concatedString);
        }
        String newString = "";
        for(int i = 0; i < str.length;i++){
            if(str.toString().equalsIgnoreCase(concatedString)){
                newString+=concatedString;
            }
        }
        System.out.println(newString);
    }
}
