package JavaBasic;

public class Test_5 {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str = str1.toLowerCase().replaceAll(" ", "");
        boolean [] freq = new boolean[256];
        char ch [] = str.toCharArray();
        System.out.println("Character Occurence: ");
        for(int i = 0; i < ch.length;i++){
            if(freq[i]) continue;
            int c = 1;
            for(int j = i + 1; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    c++;
                    freq[j] = true;
                }
            }
            System.out.println(ch[i] + " : " +c);
        }
        
    }
}
