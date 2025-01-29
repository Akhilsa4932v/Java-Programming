public class InsertionSort {
    
        public static void Insertion(int arr[]){
            for(int i=1;i<arr.length;i++){
    
                int key = arr[i];
                int prev = i-1;
    
                while(prev >=0 && arr[prev] > key){
                    arr[prev+1] = arr[prev];
                    prev = prev-1;
                }
                arr[prev+1] = key;
            }
            System.out.println("Sorted Array:");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static void main(String[] args) {
            int arr[] = {5,4,1,3,2};
            Insertion(arr);
        }
    
    
}
