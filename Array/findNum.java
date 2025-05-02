package Array;
// find number which apears one time while other are twice
public class findNum {
    
    public static int getSingleElement(int []arr) {
        // Size of the array:
        int n = arr.length;

        //Run a loop for selecting elements:
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // selected element
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) return num;
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }

}
