package Backtracking;
//backtracking with array

// 1 2 3 4 5 
//-1 0 1 2 3 

public class arrBacktrack {


    public static void changeArr(int arr[],int i,int val){

        //base case
        if(i == arr.length){
            printarr(arr);
            return;
        }

        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = val-2;
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printarr(arr);

    }
}
