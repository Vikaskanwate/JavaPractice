package JavaBasic;
// Count vowels and consonants but ignore digits and special characters.
// Example:
// Input → "Java123!!Code"  
// Output → Vowels: 4 (a, a, o, e)  
// Consonants: 6 (j, v, c, d)
public class Test_10 {
    public static void main(String[] args) {
        String s = "Java123!!Code";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int vowelCount = 0;
        int conCount = 0;
        for(int i = 0; i < s.length(); i++){
            char c  = s.charAt(i);
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c) != -1){
                    sb1.append(c);
                    vowelCount++;
                }else{
                    sb2.append(c);
                    conCount++;
                }
            }
        }
        System.out.println("vowels :" + vowelCount +"("+sb1+")"+"\n"+"consonants: "+ conCount + "("+sb2+")");

    }
}
