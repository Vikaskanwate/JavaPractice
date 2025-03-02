package Array;

public class UniqueValue {
    public static void printUniqueElement(int arr[]){
        for(int i = 0; i < arr.length;i++){
            boolean isUnique = true;
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,};
        printUniqueElement(arr);
    }
}
