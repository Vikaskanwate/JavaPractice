package JavaBasic;
// Q3. Given an array of integers, find the majority element (appears more than n/2 times).

// Input: {3, 3, 4, 2, 3, 3, 5}

// Output: 3
public class Test_24 {
    public static void main(String[] args) {
        int cnt = 0;
        int maxCnt = 0;
        int maxElement = 0;
        int arr[] = {3, 3, 4, 2, 3, 3, 5};
        for(int i = 0; i < arr.length; i++){
            cnt = 1;
                for(int j = i+1; j < arr.length ; j++){
                    if(arr[i] == arr[j]){
                        cnt++;
                    }
                }
                if(cnt > maxCnt){
                    maxCnt = cnt;
                    maxElement = arr[i];
                }
        }
        if (maxCnt > arr.length/2) {
            System.out.println(maxElement);
        } else {
            System.out.println("No majority element");
        }
    }
}
