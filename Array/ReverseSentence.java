package Array;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Hello world in java";
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        String [] words = str.split(" ");
        StringBuilder revBuilder = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            revBuilder.append(words[i]);
            if(i > 0){
                revBuilder.append(" ");
            }
        }
        return revBuilder.toString();
    }
}
