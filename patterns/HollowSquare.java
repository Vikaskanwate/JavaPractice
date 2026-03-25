public class HollowSquare {
    public static void main(String args[]){
        int i = 0,n = 5;
        do {
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            i++;
            System.out.println();
        }while(i < n);
    }
}
