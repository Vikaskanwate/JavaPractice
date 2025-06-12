package JavaBasic;
public class StringLookup { 
   static public String convertToWords(int num){
        String words[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String numStr = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        for(char digit : numStr.toCharArray()){
            result.append(words[Character.getNumericValue(digit)]).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        int number = 125643;
        System.out.println(convertToWords(number));
    }
}