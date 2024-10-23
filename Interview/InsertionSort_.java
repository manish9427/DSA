import java.util.*;
public class InsertionSort_ {
    public static void main(String args[]){
        int arr[] = {9,8,7,6,5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}