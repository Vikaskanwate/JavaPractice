package JavaBasic;
// find first non repeating  character
// First non-repeating character: p
public class Test_14 {
    public static void main(String[] args) {
        String s = "aabb";
        
        String str = s.toLowerCase();
        int freq[] = new int[26]; 
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        // main part of the program simply loop through the array of char and search every element in the freq
        //array if it equal to the 1 this way we can preserv the order as well 
        for(char ch : str.toCharArray()){
            if(freq[ch - 'a'] == 1){
                System.out.println(ch);
                return;
            }
        }
        // for(char ch : str.toCharArray()){
        //     if(freq[ch - 'a'] == 2){
        //         System.out.println("No Reapting character found.");
        //         return;
        //     }
        // }
        System.out.println("No Reapting character found.");
    }
}
