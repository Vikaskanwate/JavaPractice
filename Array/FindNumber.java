package Array;
// find a number which appears once and other twice
public class FindNumber {
    public static int find(int arr[],int n){
        for(int i = 0; i < n; i++){
            int num = arr[i];
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if(num == arr[j]){
                    cnt++;
                }
            }
            if(cnt == 1)
                return num;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4};
        int res = find(arr, arr.length);
        System.out.println(res);

    }
}
