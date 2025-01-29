public class CountingSort {
      //counting sort is good of array in small range ; eg: [2,4,5,1,4,8] range = 1-8;
    
      public static void countingSort(int arr[]){
        int largestEle = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largestEle = Math.max(largestEle,arr[i]);
        }

        int count[] = new int[largestEle+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting

        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArr(arr);
    }
}
