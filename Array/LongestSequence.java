package Array;
public class LongestSequence{
    static boolean ls(int arr[],int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static int sequence(int arr[]){
        int longest = 1;
        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            int cnt = 1;
            while (ls(arr, x + 1) == true) {
                // to break the condition we have x += 1;
                x += 1;
                cnt= cnt + 1;
            }
            longest = Math.max(cnt, longest);
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {102,4,100,1,101,3,2,1,1};
        System.out.println(sequence(arr) + " longest");
    }
}