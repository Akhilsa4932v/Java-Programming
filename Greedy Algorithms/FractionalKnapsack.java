import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
     public static void main(String[] args) {
     int val[] = {60,100,120};
     int weight[]  = {10,20,30};
     int bagW = 50;

     double ratio[][] = new double[val.length][2];

     for(int i=0;i<ratio.length;i++){
        ratio[i][0] = i;
        ratio[i][1] = val[i]/(double)weight[i];
     }

     //hight ratio has higher value; it will be consider first.

     //sort in ascending order.(ratios)
     Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

     int capacity = bagW;
     int finalVal = 0;

     for(int i=ratio.length-1;i>=0;i--){
        int idx = (int)ratio[i][0];
        if(weight[idx]<=capacity){
            finalVal += val[idx];
            capacity -= weight[idx];
        }else{
            //take fractional part of the  weigth
            finalVal += (ratio[i][1]*capacity);
            capacity = 0;
            break;
        }
     }

     System.out.println("final value:"+finalVal);
    }
}

