package JavaBasic;
// Find the longest continuous sequence of vowels and consonants.
// Example:
// Input → "beautiful"  
// Output →

// Longest vowel streak: 3 (eau)

// Longest consonant streak: 2 (t f)
public class Test_12 {
    public static void main(String[] args) {
        String s = "beautiful";
        int cv = 0, mv = 0,cc = 0,mc = 0;
        char ch []= s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(Character.isLetter(ch[i])){
                if("aeiouAEIOU".indexOf(ch[i]) != -1){
                    cv++;
                    cc = 0;
                    mv = Math.max(mv,cv);
                }else{
                    cc++;
                    cv = 0;
                    mc = Math.max(mc, cc);
                }
            }   

        }
        System.out.println("Longest vowel streak: " + mv);
        System.out.println("Longest consonant streak: " + mc);
        
    }
}
