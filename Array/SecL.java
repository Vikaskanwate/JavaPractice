package Array;
public class SecL{
    static int secLarge(int arr[]){
        int l = Integer.MIN_VALUE,s = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > l){
                s = l;
                l = arr[i];
            }else if(arr[i] > s && l != s){
                s = arr[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[] ={35,20,30,40,37};
        int s =secLarge(arr);
        System.out.println(s+ " is the sec largest");
    }
}