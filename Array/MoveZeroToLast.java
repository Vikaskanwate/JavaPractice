package Array;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToLast{
    public static void main(int arr[]){
        List<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                al.add(arr[i]);
            }
        }

        for(int i = 0; i < al.size();i++){
            arr[i] = al.get(i);
        }
        for(int i = al.size(); i < arr.length; i++){
            arr[i] = 0;
        }
    }
    
    public static void main(String args[]){
        int arr[] = {10,0,20,30,0,4,5,0};
        main(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}