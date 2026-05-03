    package JavaBasic;
    // Q2. Check if an array is palindromic (same forwards and backwards).
    // Input: {1, 2, 3, 2, 1}
    // Output: true
    public class Test_23 {
    static boolean chk_pal(int arr[]){
            if(arr.length == 0) return false;
            int right = arr.length -1;
            int left = 0;
            while(left < right){
                if(arr[left] != arr[right]){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
        public static void main(String[] args) {
            int arr[] = {1, 2, 6, 2, 1};
            System.out.println(chk_pal(arr));
        }
    }
