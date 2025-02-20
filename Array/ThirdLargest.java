package Array;
public class ThirdLargest {
    public static int thirdLargestElement(int arr[]){
        int first=Integer.MIN_VALUE,sec= Integer.MIN_VALUE,third = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first){
                third = sec;
                sec = first;
                first = arr[i];
            }else if(arr[i] > sec){
                third = sec;
                sec = arr[i];
            }else if(arr[i] > third){
                third = arr[i];
            }

        }
        return third;
    }
    public static void main(String args[]){
        int arr[] = {10,6,5,30,40};
        System.out.println("Third largest element in array "+thirdLargestElement(arr));
    }
}
