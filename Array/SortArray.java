package Array;

// sort arrays 0's , 1's and 2
public class SortArray {
    public static void sort(int arr[]){
        int n = arr.length;
        int cnt0=0,cnt1 = 0, cnt2 = 0; 
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                cnt0++;
            }else if(arr[i] == 1){
                cnt1++;
            }else {
                cnt2++;
            }
        }

        for(int i = 0; i < cnt0; i++){
            arr[i] = 0;
        }
        for(int i = cnt0; i < cnt0 + cnt1; i++){
            arr[i] = 1;
        }
        for(int i = cnt0 + cnt1; i < n; i++){
            arr[i] = 2;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,1,2,0,0,0,1};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
