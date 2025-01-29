
// 2 
// 2 4
// 2 4 6
// 2 4 6 8
// 2 4 6 8 10

// 4
// 4 6
// 4 6 8
// 4 6 8 10

// 6
// 6 8
// 6 8 10

// 8
// 8 10

// 10

// totolpairs:15

public class SubArray {
    public static void pairs(int nums[]){
        int totolpairs = 0;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){ //print
                    System.out.print(nums[k]+" ");
                }
                totolpairs++;
                System.out.println();
            }
            System.out.println();
        }
      System.out.println("totolpairs:"+totolpairs);
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        pairs(nums);
      
    }
}
