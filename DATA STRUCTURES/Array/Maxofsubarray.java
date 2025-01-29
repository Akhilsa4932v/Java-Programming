
// SUB ARRAYS OF ARRAY [2,4,6,8,10];

// 2 --->2
// 2 4 --->6
// 2 4 6 --->12
// 2 4 6 8 --->20
// 2 4 6 8 10 --->30
// Max sum is:30

// 4 --->4
// 4 6 --->10
// 4 6 8 --->18
// 4 6 8 10 --->28
// Max sum is:28

// 6 --->6
// 6 8 --->14
// 6 8 10 --->24
// Max sum is:24

// 8 --->8
// 8 10 --->18
// Max sum is:18

// 10 --->10
// Max sum is:10

// totalPairs : 15

// public static void subArray(int arr[]){

//     int totalPairs = 0;
//     for(int i=0;i<arr.length;i++){
//         int start = i;
//         int maxsum = Integer.MIN_VALUE;

//         for(int j=i;j<arr.length;j++){
//            int end  = j;
//            int sum = 0;

//            for(int k=start;k<=end;k++){
//             sum += arr[k];
//             System.out.print(arr[k]+" ");
            
//            }
//            totalPairs++;
//            if(sum>maxsum){
//             maxsum = sum;
//            }
//            System.out.print("--->"+sum);
//            System.out.println();
//         }
//         System.out.println("Max sum is:"+maxsum);
//         System.out.println();
//     }
//     System.out.println("totalPairs : "+totalPairs);
     
// }

// 2
// 6
// 12
// 20
// 30
// 4
// 10
// 18
// 28
// 6
// 14
// 24
// 8
// 18
// 10
// maxsum: 30
public class Maxofsubarray {
    public static void maxofsubarray(int nums[]){
        
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum += nums[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
               
            }
           
        }
      System.out.println("maxsum: "+maxsum);
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        maxofsubarray(nums);
      
    }
}

//above code , time complexity = n^3  3 loops running upto n numbers so n cube

//optimise version - "using an extra array"-O(n^2)

/*
public class Maxofsubarray {
public static void maxofsubarray(int nums[]){
        
    int maxsum = Integer.MIN_VALUE;
    int currsum = 0;
    int prefix[] = new int[nums.length];

    prefix[0] = nums[0];
    //calculate prefix array;

    for(int i=1;i<prefix.length;i++){
        prefix[i] = prefix[i-1] + nums[i];
    }

    for(int i=0;i<nums.length;i++){
        int start = i;
        for(int j=i;j<nums.length;j++){
          
            int end = j;

            currsum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
            
            if(maxsum<currsum){
                maxsum = currsum;
            }
           
        }
       
    }
  System.out.println("maxsum: "+maxsum);
}

public static void main(String[] args) {
    int nums[] = {2,4,6,8,10};
    maxofsubarray(nums);
  
}
}*/


//USING KADANES TRICK (Finding max of sub arrays sum)**** it says for -ve values take as zero.

// public class Basic{

//     //tc: O(N)
//     public static void kadanes(int arr[]){
//        int maxsum = Integer.MIN_VALUE;
//        int currsum = 0;

//        for(int i=0;i<arr.length;i++){
//         currsum = currsum + arr[i];
//         if(currsum < 0){
//             currsum = 0;
//         }

//         maxsum = Math.max(currsum,maxsum);
//        }

//        System.out.println("max sum: "+maxsum);
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,1,5,4,7};
//         kadanes(arr);
//     }
// }