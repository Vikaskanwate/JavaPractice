package Array;

import java.util.HashSet;
import java.util.Set;

public class CommonElement{

    public static void findCommonElmenent(String arr1[], String arr2[]){
        Set<String> s = new HashSet<>();
        for(int i = 0; i < arr1.length;i++){
            for(int j = 0; j < arr2.length;j++){
                if(arr1[i].equals(arr2[j])){
                    s.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println(s.toString());
    }
    public static void main(String[] args) {
        String[] arr1 = {"artical","in","Geeks","for","geeks"};
        String[] arr2 = {"Geeks","for","geeks"};
        findCommonElmenent(arr1, arr2);
    }
}