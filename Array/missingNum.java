package Array;
// find missing number in array
public class missingNum {

    public static int find(int arr[]){
    
        for(int i = 1; i <= arr.length; i++){
            int flag = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5};

        int ans = find(a);
        System.out.println("The missing number is: " + ans);
    }
}
