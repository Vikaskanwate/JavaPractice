package JavaBasic;

public class StringLook1 {
    // input = 1234 
    // output = one thousand two hundred thirty four
    private static final String[] belowTwenty ={
        "","one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
        "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens ={
        "","","twenty","thirty","forty","fifty","sixty","seventy","eight","ninety"
    };

    public static String numberToWord(int num){
        if(num == 0) return "zero";
        return convert(num);
    }

    private static String convert(int num){
        if(num < 20) return belowTwenty[num];
        if(num < 100) return tens[num / 10] + (num % 10 != 0 ? " " + belowTwenty[num % 10] : "");
        if(num < 1000) return belowTwenty[num / 100] + " hundred" + (num % 100 != 0 ? " " + convert(num % 100) : "");
        if(num < 10000) return convert(num / 1000) + " thousand" + (num % 1000 != 0 ? " " + convert(num % 1000) : "");  

        return "Number too large";
    }

    public static void main(String[] args) {
        int number = 1234;
        System.out.println(numberToWord(number));
    }
}
