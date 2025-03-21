package JavaBasic;

public class fibbonaci {
    public static void main(String[] args) {
        int terms = 5;
        int first = 0;
        int second = 1;
        int next = 0;
        for(int i = 1 ; i <= terms; i++){
            // System.out.print(first);
            next = second + first;
            first = second;
            second = next;
        }
        System.out.println(next);
    }
}
