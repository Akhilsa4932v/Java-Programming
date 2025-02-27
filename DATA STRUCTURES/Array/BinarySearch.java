
public class BinarySearch {
    public static int binarySearch(int num[],int key){
        int start = 0, end = num.length-1;
        
        while(start <= end) {
            int mid = (start + end) / 2;

            if(num[mid] == key){  //found 
                return mid;
            }
            if(num[mid] < key){
                start = mid+1;  //considering right part of mid
            }else{                                                                                                                                              
                end = mid-1;
            }
           
        }
        return -1;
        
    }

    public static void main(String args[]) {
        int num[] = {2,4,6,8,10,12,14};
        int key = 4;

        System.out.println("index for key is : "+binarySearch(num, key));
    
}
}
