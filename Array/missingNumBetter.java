package Array;
// missing number better approch
public class missingNumBetter {


    public static int find(int arr[],int N){
        int sum = (N * (N + 1)) / 2;
        int s2 = 0;
        for(int i = 0; i < N -1; i++){
            s2 += arr[i];
        }
        int missingNum = sum - s2;

        return missingNum;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5};
        int N = 5;

        int ans = find(a, N);
        System.out.println("The missing number is: " + ans);
    }
    
}
