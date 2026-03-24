public class SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("Before swap ");
        System.out.println("First number " + a);
        System.out.println("second number " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swap");
        System.out.println("First number  " + a);
        System.out.println("second number " + b);
    }
}
