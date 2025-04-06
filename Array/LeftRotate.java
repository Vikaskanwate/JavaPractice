package Array;

public interface LeftRotate {
    // left rotate by d places
    public static void leftRotate(int arr[],int n,int d){
        d = d % n;
        int temp[]={};
        for(int i = 0; i < d; i++){
            temp[i]  = arr[i];
        }
        for(int i = d; i < n; i++){
            arr[i - d] = arr[i];
        }

        for(int i = n - d; i < n; i++){
            arr[i] = temp[i-(n-1)];
        }
    }
    public static void main(String[] args) {
        
    }
}
