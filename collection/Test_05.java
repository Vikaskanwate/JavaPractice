package collection;
// 2. Group Anagrams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Problem:
// Group words that are anagrams of each other.
// Input:  ["eat", "tea", "tan", "ate", "nat", "bat"]
// Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
public class Test_05 {


    public static List<List<String>> groupAnagrams(String [] words) {
       HashMap<String,List<String>> map = new HashMap<>();
        for (String word : words){
            // here we are converting the words into the array of char
            char[] chars = word.toCharArray();
            // here we are sorting the word when the word is sorted we can simply figure out the anagram
            Arrays.sort(chars);
            // we are converting the word into the string
            String key = new String(chars);
            // here we are using sorted string as a key based on that we are trying to find the anagrams
            // example - key :'aet' if this does not exists it will create new list with the word
            // 'aet':[eat] 
            // for the second iteration for word tea sorted = aet
            // aet alreay exists so simply compute method will return the pre-existing list and word will be added
            // ['eat','tea'] 
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));
    }
}
