
class MaxDemo{
    static int max_version1(int a , int b){
        return (a > b ) ? a : b; 
    }

    static int max_version2(int a, int b){
        return Math.max(a, b);
    }
}
public class MaxOfNum {
    public static void main(String[] args) {
        System.out.println("Max of two numbers "+MaxDemo.max_version1(5, 6));
        System.out.println("Max of two numbers " + MaxDemo.max_version2(87, 112));

    }
}
