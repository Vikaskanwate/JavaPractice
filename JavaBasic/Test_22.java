// Q1. Write a Java program to find the second smallest element in an integer array.
// Input: {12, 5, 7, 3, 19}
// Output: 5
package JavaBasic;
public class Test_22 {
    public static void main(String[] args) {
        // int arr []= {10, 20, 4, 45, 99};
        int arr[] ={12, 5, 7, 3, 19};
        int smallest = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                secSmall = smallest;
                smallest = arr[i];
            }else if(arr[i] < secSmall && arr[i] != secSmall){
                secSmall = arr[i];
            }
        }
        System.out.println(secSmall);
    }
}
