package Array;

public class mergeTwoArr {
    public static void merge(int arr1[],int arr2[],int arr3[]){
        int i = 0, j = 0 ,k = 0;
        int n1 = arr1.length;
        int n2 = arr2.length; 

        while(i < n1 && j < n2){

            if(arr1[i] < arr2[j] )
                arr3[k++] = arr1[i++];
            else 
                arr3[k++] = arr2[j++];
        }      
        while (i < n1) {
            arr3[k++] = arr1[i++];
        }
        while (j < n2) {
            arr3[k++] = arr2[j++];
        }
    }
    public static void main(String[] args) {
        int[] ar1 = {1, 3, 5, 7};
        int[] ar2 = {2, 4, 6, 8};

        int[] ar3 = new int[ar1.length + ar2.length];

        merge(ar1, ar2, ar3);

        for (int value : ar3)
            System.out.print(value + " ");
    }
}
