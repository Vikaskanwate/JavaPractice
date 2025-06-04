package JavaBasic;
// String reverse hello world output: world hello
public class Str1 {
    public static void main(String[] args) {
        String str = "Hello World";

        String [] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length -1; i >= 0; i--){
            reversed.append(words[i]).append(" ");
        }
        System.out.println(reversed.toString().trim());

    }
}
