package JavaBasic;

public class Test_20 {
    static int countVowels(String str){
        int countVowels = 0;
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch) != -1) countVowels++;
            }
        }
        return countVowels;
    } 
    static int countCons(String str){
        int countCon = 0;
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch) == -1) countCon++;
            }
        }
        return countCon;
    } 

    public static void main(String[] args) {
        String s = "   Java STRING Practice practice   ";
        String [] word = s.trim().toLowerCase().split(" ");
        
        for (int i = 0; i < word.length; i++) {
            word[i] = word[i].substring(0,1).toUpperCase() + word[i].substring(1);
            System.out.print(word[i] + " ");
        }
        System.out.println();
        String cleaned = "";
        for(int i  = 0; i < word.length;i++){
            if(!cleaned.contains(word[i])) cleaned += String.valueOf(word[i]) + " ";
            
        }
        String rev = "";
        for(char ch : cleaned.toCharArray()){
            rev = ch + rev;
        }

        int countV = 0;
        int countC = 0;
        countV += countVowels(cleaned);
        countC += countCons(cleaned);
        
        String longest =  " ";
        for(String st : cleaned.split(" ")){
            if (st.length() > longest.length()) longest = st;
        }
        System.out.println(cleaned);
        System.out.println(rev.trim());
        System.out.println(countV + " " + countC);
        System.out.println(longest);
    }
}
