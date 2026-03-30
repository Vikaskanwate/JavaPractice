public class TotalDigits {
    public static void main(String args[]){
        int a = 12345;
        int len = 0;
        while(a != 0){
            len++;
            a /= 10;
        }
 
        System.out.println(len);
    }
}
