package JavaBasic;
// find the length of longest non-repeating substring 
public class Test_15{
    public static void main(String[] args) {
        String s = "abcabcbb";
        int freq[] = new int[256];
        int left = 0, maxLen = 0;
        StringBuilder sb = new StringBuilder();
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            freq[c]++;
            while(freq[c] > 1){
                freq[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen,right - left + 1);
        }
        System.out.println(maxLen + " " + sb.toString());
    }
}