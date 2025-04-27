package Array;
// largest element in the array
public class Largest {

    static int largest(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={10,20,50,40,30};
        System.out.println(largest(arr) + "  is largest element");
    }

}
