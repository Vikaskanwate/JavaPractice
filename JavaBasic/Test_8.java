package JavaBasic;
// count occurence of character
public class Test_8 {
    public static void main(String[] args) {
        String str = "success";
        int c [] =new int[256];
        for(char ch : str.toCharArray()){
            c[ch]++;
        }
        for(int i = 0; i < c.length;i++){
            if(c[i] > 0){
                System.out.println((char)i + ":"+ c[i]);
            }
        }

    }
}
