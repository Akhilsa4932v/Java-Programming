public class SelectionSort {
    public static void Selection(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void Printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
      
        Selection(arr);
        Printarr(arr);

    }

}
