public class TrappingRainWater1{
    
    public static int TrappingRainWater(int height[]){
        int n = height.length;

        //calculating left max boundary

        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //calculating right max boundary

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];

        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);

        }

        int TrappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightmax[i]);
            TrappedWater += waterLevel - height[i];
        } 

        return TrappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int res = TrappingRainWater(height);
        System.out.println(res);
    }
}
