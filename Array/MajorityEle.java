package Array;
public class MajorityEle{

    // majority  elements is ele which appears > n / 2 times
    public static int findElement(int arr[],int n){
        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j])
                    cnt++;
            }
            if(cnt > n / 2)
                return arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,1,2,2};
        System.out.println(findElement(arr, arr.length) + " is majority element in arr");

    }
}