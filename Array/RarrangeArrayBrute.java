package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RarrangeArrayBrute {
    // RearrageBySign 
    public static ArrayList<Integer> RearrangeArray(ArrayList<Integer> A){
        int n = A.size();

        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,0));
        int posIdx = 0,negIdx = 1;
        for(int i = 0; i < n; i++){
            if(A.get(i) > 0){
                ans.set(posIdx, A.get(i));
                posIdx += 2;
            }else{
                ans.set(negIdx, A.get(i));
                negIdx += 2;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,-4,-5));
        ArrayList<Integer> ans = RearrangeArray(A);

        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i)  + " ");
        }
    }
}
