package Array;

public class Seclargest {
    public static int sec(int arr[])
    {
        int sec = Integer.MIN_VALUE;
        int lar = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(lar < arr[i]){
                sec = lar;
                lar = arr[i];
            }else if(sec != lar && sec < arr[i]){
                sec = arr[i];
            }
        }
        return sec;
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40};
        System.out.println(sec(arr));
    }
}
