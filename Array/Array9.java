package Array;

import java.util.Scanner;
// find the second largest element in Array
public class Array9 {
    public static int findSecondLarget(int arr[]){
        int largest,secLargest;
        largest = secLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length;i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secLargest && arr[i] !=largest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {

        int arr[] = new int[5];
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the 5 element ");
            for(int i = 0; i < 5; i++){
                arr[i] = sc.nextInt();
            }
        };
        System.out.println("second Largest element is " + findSecondLarget(arr));
    }
}
