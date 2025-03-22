package Array;
public class LargestElemet {
    public static int largestElemet(int arr[]){
        int Largest = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(Largest < arr[i]){
                Largest = arr[i];
            }
        }
        return Largest;
    } 
    public static void main(String args[]){
        int arr[] = {10,20,30,701,50};
        System.out.println(largestElemet(arr));
    }
}