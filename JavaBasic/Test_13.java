package JavaBasic;
// find longest consecutive vowel in string
public class Test_13 {
    public static void main(String[] args) {
        String s = "beautiful";
        String currentVowel = "" , longestVowel = "";
        int vowelCount = 0,maxCount = 0;
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch) != -1){
                    vowelCount++;
                    currentVowel += ch;
                    if (vowelCount > maxCount){
                        maxCount = vowelCount;
                        longestVowel = currentVowel;
                    }
                }else{
                    currentVowel = "";
                    vowelCount = 0;
                }
            }
        }
        System.out.println("streak of vowels: " + maxCount + " longest vowels :(" + longestVowel + ")");
        
    }
}
