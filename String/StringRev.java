//Reversing string without changing the sequence of the word!
public class StringRev{
    public static String stringReverse(String s){
        String[] words = s.split(" ");
        StringBuilder reversedString  = new StringBuilder();
        
        for(String word : words)
        {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }
        return reversedString.toString().trim();
    }

    public static void main(String args[]){
        // with out using that much complicated logic 
        String name = "WAP to reverse a String in java";
        String nameArr[] = name.split(" ");
        for(String word : nameArr){
            StringBuffer bf = new StringBuffer(word);
            bf.reverse();
            System.out.print(bf + " ");
        }
    }
}