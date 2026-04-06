package New.String;
public class CountVc {
    public static void main(String[] args) {
        String str = "Intermdiate Java Strings";
        str = str.toLowerCase();

        int vowels = 0, cons = 0;
        for(char c : str.toCharArray()){
            // if character not present it will return -1
            if("aeiou".indexOf(c) != -1){
                vowels++;
            }else if(Character.isLetter(c)){
                cons++;
            }
        }
        System.out.println("Vowels: " + vowels + ", consonants: " + cons);
    }    
    
}
