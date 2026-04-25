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
        // String s = " Java is IS fun FUN ";
        String s = " HELLO hello WORLD world ";
        String words[] = s.trim().toLowerCase().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        String cleaned = "";
        for(int i = 0; i < words.length; i++){
            if(!cleaned.toLowerCase().contains(words[i].toLowerCase())){
                cleaned += words[i] + " ";
            }
        }       
        cleaned = cleaned.trim();
        int vowels = 0, consonants = 0;
        for(int i = 0; i < cleaned.length();i++){
            if(Character.isLetter(cleaned.charAt(i))){
                if("aeiouAEIOU".indexOf(cleaned.charAt(i))!= -1) vowels++;
                else consonants++;
            }
        }

        String [] finalWord = cleaned.split(" ");
        String longest = "";
        for(String w : finalWord){
            if(w.length() > longest.length()) longest = w;
        }
        System.out.println("Cleaned sentence: " + cleaned);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Longest word: " + longest);
    }
}
