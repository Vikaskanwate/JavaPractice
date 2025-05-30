package JavaBasic;

public class RevNumber {

    static public int rev(int num){
        int rev = 0; 
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static StringBuilder revnum(String num){
        StringBuilder str = new StringBuilder();
        for(int i = num.length()-1; i >= 0; i--){
            str.append(num.charAt(i));
        }
        return str;
    }
    public static void main(String[] args) {
        // System.out.println(rev(1000));
        System.out.print(revnum("00001"));
    }
}
