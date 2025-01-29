//brute force approach--O(n^2)
import java.util.ArrayList;

public class ContainsMaxWater {

    public static int maxWater(ArrayList<Integer> heights){
        int max = 0;

        for(int i=0;i<heights.size();i++){
            for(int j=i+1;j<heights.size();j++){
                int height = Math.min(heights.get(i),heights.get(j));
                int width = j-i;
                int currwater = height * width;
                max = Math.max(max, currwater);

            }
        }
        return max;
    }
    public static void main(String[] args) {
      
       ArrayList<Integer> heights = new ArrayList<>();
       heights.add(1);
       heights.add(8);
       heights.add(6);
       heights.add(2);
       heights.add(5);
       heights.add(4);
       heights.add(8);
       heights.add(3);
       heights.add(7);

System.out.println(maxWater(heights));
       

    }
}

//2 pointer approach -- >O(n);


// public static int maxWater(ArrayList<Integer> heights){
//     int maxWater = 0;
//     int lp = 0;
//     int rp = heights.size()-1;

//     while (lp<rp) {
//      int height = Math.min(heights.get(lp), heights.get(rp));
//      int width = rp-lp;
//      int currwater = height * width;
//      maxWater = Math.max(maxWater, currwater);

//      if(heights.get(lp)<heights.get(rp)){
//          lp++;
//      }else{
//          rp--;
//      }

//     }
//      return maxWater;
//  }
//  public static void main(String[] args) {
   
//     ArrayList<Integer> heights = new ArrayList<>();
//     heights.add(1);
//     heights.add(8);
//     heights.add(6);
//     heights.add(2);
//     heights.add(5);
//     heights.add(4);
//     heights.add(8);
//     heights.add(3);
//     heights.add(7);

// System.out.println(maxWater(heights));
    

//  }