import java.util.Arrays;

public class FloorandCeil {
    
    public static void binary(int arr[],int k){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int ceil = -1;
        int floor = -1;
        while (i<=j) {
              int mid = (i+j)/2;
              if(arr[mid]>=k){
                 ceil = mid;
                 j=mid-1;
              }else{
                  floor = mid;
                  i = mid+1;
              }
         }

              System.out.println(floor);
              System.out.println(ceil);
     }
    
     

    
    public static void main(String args[]){
    int arr[] = {5,5,5,6,6,8,9};
    binary(arr, 7);
   
    }
}
