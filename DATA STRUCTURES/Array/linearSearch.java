
// Linear search for strings

// public class linearSearch{
//  public static int LinearSearch(String menu[],String key){
//             for(int i=0;i<menu.length;i++){
//                 if(menu[i]==key){
//                     return i;
//                 }
//             }
//             return -1;
    
//         }
//         public static void main(String args[]){
//         //    int nums[] = {14,25,8,1,5,10};
//            String menu[] = {"dosa","idli","samosa"};
//            String key = "samosa";
    
//            int index = LinearSearch(menu, key);
//            if(index==-1){
//             System.out.println("Not found");
//            }   
//            else{
//             System.out.println(index);
//            }                                                            
    
//         }
//     }

// Linear search for numbers

// public static int LinearSearch(int nums[],int key){
//     for(int i=0;i<nums.length;i++){
//         if(nums[i]==key){
//             return i;
//         }

//     }
//     return -1;
// }

// public static void main(String args[]){
// int nums[]= {1,40,5,70,12,4};
// int key = 12;

// int index = LinearSearch(nums, key);
// if(index == -1){
//     System.out.println("not found");
// }
// else{
//     System.out.println(+key+ " is at: "+index+" index");
// }

// }


// finding largest and smallest number in array

// import java.util.*;
// public class JavaBasic{

//    public static int getLargeNum(int num[]){
//     int largest = Integer.MIN_VALUE;//-infinity
//     int smallest = Integer.MAX_VALUE;//+infinity
//     for(int i=0;i<num.length;i++){
//         if(largest<num[i]){
//             largest=num[i];
//         }
//         if(smallest>num[i]){
//             smallest = num[i];
//         }
//     }
//     System.out.println("smallest num in array : "+smallest);
//     return largest;
// }
//    public static void main(String[] args) {
//     int num[] = {2,5,4,7,8,6};
//     System.out.println("largest numbers is: "+getLargeNum(num));
    
   
//    }
// }