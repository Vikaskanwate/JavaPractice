package JavaBasic;
// /String length using recursion
public class Test_31 {

    static int findLength(String s){
        if(s.isEmpty()){
            return 0;
        }
        return 1 + findLength(s.substring(1));
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Length of string: " + findLength(str));
    }
}
