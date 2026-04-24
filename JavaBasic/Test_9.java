package JavaBasic;
// count the consonents and vowels in string and only take unique values
public class Test_9 {
    public static void main(String[] args) {
        int vowelCount = 0;
        int conCount = 0;
        String s = "mississippi";
        StringBuilder sb =  new StringBuilder();
        // this is how can i check if value is present in the string builder or not
        for(char st : s.toCharArray()){
            if(sb.indexOf(String.valueOf(st)) == -1)
                sb.append(st);
        }
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(char ch : sb.toString().toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                sb1.append(ch);
                vowelCount++;
            }else{
                sb2.append(ch);
                conCount++;
            }
        }
        System.out.println("Unique vowels :" + vowelCount +"("+sb1+")"+"\n"+"Unique consonants: "+ conCount + "("+sb2+")");
    }
}
