package Array;

public class TwoSum{

    static void sum(int arr[],int sum){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum) {
                    System.out.println("index of two element " + i +" " + j);
                    break;
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,45};
        sum(arr, 50);
    }

}