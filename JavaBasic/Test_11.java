package JavaBasic;

public class Test_11 {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
    
        for(int i = 0; i < s.length(); i++){
            char c  = s.charAt(i);
            if(Character.isLetter(c)){
                if("aeiouAEIOU".indexOf(c) != -1){
                    sb1.append("Index ").append(i).append(": ").append(c).append("\n");
                }else{
                    sb2.append("Index ").append(i).append(": ").append(c).append("\n");
                }
            }
        }
        System.out.println("Vowel positions:\n" + sb1);
        System.out.println("Consonant positions:\n" + sb2);
    }
}
