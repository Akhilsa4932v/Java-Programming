package Sorting;

//searchinf ele in sorted rotated array , the arr ele rotated based on pivot ele.
public class SortedRotatedArray {



   
        public static void show(int arr[]){
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    
        public static int searchIn_sorted_rotated(int arr[],int target,int si,int ei){
    
            if(si>ei){
                return -1;
            }

            int mid = (si+ei) / 2;

            ///case found
            if(arr[mid] == target){
                return mid;
            }

            //mid on L1
            if(arr[si]<=arr[mid]){
                //case a : 
                if(arr[si]<=target && target<=arr[mid]){
                    return searchIn_sorted_rotated(arr, target, si, mid-1);
                }else{
                    //case b:
                    return searchIn_sorted_rotated(arr, target, mid+1, ei);
                }
              
                
            }
            //mid on L2
            else{
                //case c:
                if(arr[mid]<=target && target<=arr[ei]){
                    return searchIn_sorted_rotated(arr, target, mid+1, ei);
                }else{
                    //case d:
                    return searchIn_sorted_rotated(arr, target, si, mid-1);
                }
            }
           

    
        }
        public static void main(String[] args) {
            int arr[] = {4,5,7,0,1,2};
            show(arr);
            int targetIdx = searchIn_sorted_rotated(arr, 2,0, arr.length-1);
            System.out.println(targetIdx);
           
    
            
    
        }

}

