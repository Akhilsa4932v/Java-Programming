package Sorting;

public class Quick_Sort {

    
    public static void show(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }

        int pIdx = partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }
    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[] = {2,7,10,5,9};
        show(arr);
        quickSort(arr, 0, arr.length-1);
        show(arr);

        

    }
}

