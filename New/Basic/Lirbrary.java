import java.util.Scanner;

public class Lirbrary {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();

            if(s.isEmpty() || !s.contains("B")){
                System.out.println(0 + " " + 0);
                return;
            }

            int sections = 0;
            int maxSize = 0;
            int currentCount = 0;
            
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'B'){
                    currentCount++;
                }else{
                    if(currentCount > 0){
                        sections++;
                        maxSize = Math.max(maxSize, currentCount);
                        currentCount = 0;
                    }
                }
            }

            if(currentCount > 0){
                sections++;
                maxSize = Math.max(maxSize, currentCount);
            }

            System.out.println(sections + "  "  + maxSize);
        }

    }
}
