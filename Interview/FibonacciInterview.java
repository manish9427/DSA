public class FibonacciInterview {
    public static void main(String args[]){
        int n=6;
        int arr[] = new int[6];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("Output: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
    } 
}