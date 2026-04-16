package JavaBasic;
public class Test_7 {
    public static void main(String[] args) {
        String str = "Hello World!";
        String [] words = str.split(" ");
        for(int i = 0; i < words.length; i++){
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        String result = String.join(" ",words);
        System.out.println(result);
        
    }
}
