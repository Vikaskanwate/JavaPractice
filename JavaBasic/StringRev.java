package JavaBasic;
// reverse word in string
public class StringRev {
    public static void main(String[] args) {
        String str = "Hello World";
        
        String [] words = str.split(" ");

        StringBuilder reversed = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            reversed.append(words[i]).append(" ");
        }
        System.out.println(reversed.toString().trim());
    }

}
