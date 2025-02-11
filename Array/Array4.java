// replace the array with the another element in specified index 
public class Array4 {
    public static int [] arr(int arr[],int pos,int num){
        for(int i = 0; i < arr.length -1; i++){
            if(pos == i){
                arr[i] = num; 
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        
        for(int i :arr(arr,1,50)){
            System.out.print(i + " ");
        }
    }
}
