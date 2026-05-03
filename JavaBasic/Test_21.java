package JavaBasic;
public class Test_21 {
    public static void main(String[] args) {
        int arr []= {10, 20, 4, 45, 99};
        // int arr[] = {20,10,15,5,43};
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int i =0; i < arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secLargest && arr[i] != secLargest){
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);
    }
}
