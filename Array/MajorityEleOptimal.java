package Array;
public class MajorityEleOptimal {

    static int findE(int arr[]){
        int n = arr.length;
        int cnt = 0;
        int elm= 0;
        for(int i = 0; i < n; i++){
            if(cnt == 0){
                cnt++;
                elm = arr[i];
            }else if(arr[i] == elm){
                cnt++;
            }else {
                cnt--;
            }
        }
        // return cnt;
        int cnt1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == elm) cnt1++;
        }
        if(cnt1 > (arr.length/2)) 
        return elm;
    return -1;
    }


    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 2, 3, 3, 3, 1, 3};
        System.out.println(findE(arr));

    }
}