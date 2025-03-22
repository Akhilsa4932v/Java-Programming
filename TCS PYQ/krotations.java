public class krotations {
    public static void rotated(int arr[],int k){
    
        int n=arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void reverse(int arr[],int si,int ei){

        while (si<ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void main(String args[]){
  
       int arr[]={1,2,3,4,5,6,7};  //5 6 7 1 2 3 4 
       rotated(arr, 3);
      
    }
}
