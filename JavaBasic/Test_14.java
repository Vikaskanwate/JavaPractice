package JavaBasic;
// find first non repeating  character
// First non-repeating character: p
public class Test_14 {
    public static void main(String[] args) {
        String s = "programming";
        
        String str = s.toLowerCase();
        int freq[] = new int[26]; 
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }

        for(char ch : str.toCharArray()){
            if(freq[ch - 'a'] == 1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println("No Reapting character found.");
    }
}
