package Array;

public class BinarySearch {
    // binary search 
    public static int Binary(int arr[],int target){
        int st = 0, end = arr.length - 1;
        while(st <= end){
            int mid = (st + end) / 2;

            if(target > arr[mid])
                st = mid + 1;
            else if(target < arr[mid])
                end = mid - 1;
            else 
                return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        int search = Binary(arr, 20);
        System.out.println(search);
        System.out.println(arr[search]);
    }
}
