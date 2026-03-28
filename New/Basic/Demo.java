public class Demo {
    static int addition(int a,int b){
        int c = a + b;
        return c;
    }
}


class Test{
    public static void main(String[] args) {
        System.out.println(Demo.addition(5,5));
    }
}