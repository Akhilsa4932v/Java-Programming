package Recursion;


//check if the given array is sorted

public class SortedArr {
    public static boolean sortArr(int arr[],int i){

        if( i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return sortArr(arr, i+1);
    
        
    }
    public static void main(String[] args) {
        
      int arr[] = {1,2,3,4};
      System.out.println(sortArr(arr, 0));
    }
}

