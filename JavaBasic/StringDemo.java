package JavaBasic;
// the original String concatenation is done like this for a given copy i<=1<=k if i is odd,reverse the given string 
// and concatenate else concatenate the original string

import java.util.Scanner;

class StringDemo {

    public static String concateString(String S, int K){
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= K; i++){
            if(i % 2 == 0){
                result.append(S);
            }else{
                result.append(new StringBuilder(S).reverse().toString());
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int k = sc.nextInt();
            
            String res = concateString(s, k);
            System.out.println(res);
        }
    }

} 