
import java.util.*;
public class maxele {
    public static ArrayList<Integer> maxelement(int arr[],int k){

        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
    
        for(int i=0;i<=n-k;i++){
          int max = Integer.MIN_VALUE;
          for(int j=i;j<i+k;j++){
            if(arr[j]>max){
              max = arr[j];
            }
          }
          al.add(max);
    
        }
    
        return al;
      }
      public static void main(String args[]){
      
        int arr[] = {1,3,-1,-3,5,3,6,7};
        ArrayList<Integer> al = maxelement(arr, 3);
        System.out.println(al);
       
      } 
}
