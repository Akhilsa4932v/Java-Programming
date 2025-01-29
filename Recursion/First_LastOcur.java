package Recursion;

//*finding an elements first occurence in the ARRAY*/

public class First_LastOcur{
    public static int first_Occurence(int arr[],int key,int i){


        if(i==arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return first_Occurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,7,5,8,5,56,6};
        System.out.println(first_Occurence(arr, 5, 0));
    }
    
}


//finding an elements last occurence in the ARRAY;

/*
public static int last_Occurence(int arr[],int key,int i){

    if(i == arr.length){
        return -1;
    }
    
    int isFound = last_Occurence(arr, key, i+1);

    if(isFound == -1 && arr[i] == key){
        return i;
    }

    return isFound;

  
}

public static void main(String[] args) {
    int arr[] = {1,7,5,8,5,56,8};
    System.out.println(last_Occurence(arr, 8, 0));
}
    */


//2nd logic for last occurence

// public static int fOcc(int arr[],int key,int i){
      
//     if(i == -1){
//         return i;
//     }
    
//     if(arr[i]==key){
//         return i;
//     }

//     return fOcc(arr, key, i-1);
    
    
// }
// public static void main(String args[]){
//    int arr[] = {1,2,3,4,2,4,8,65,3,44,80};
//    System.out.println(fOcc(arr, 3,arr.length-1));
    
    
// }