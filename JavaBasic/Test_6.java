package JavaBasic;

public class Test_6 {
    public static void main(String[] args) {
        String s = "Banana";
        String str = s.toLowerCase().replaceAll(" ", "");

        int freq[] = new int[26];

        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }

        for(char ch : str.toCharArray()){
            if(freq[ch - 'a'] == 1 ){
                System.out.print(ch);
                return;
            }
        }
        
    }
}
