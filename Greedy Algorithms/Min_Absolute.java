import java.util.*;

public class Min_Absolute {
   

//check the logic behind the code.


    public static void main(String[] args) {
     int A[] = {4,1,8,7};
     int B[] = {2,3,6,5};

     Arrays.sort(A);
     Arrays.sort(B);

     int minAbsolute = 0;

     for(int i=0;i<A.length;i++){
        minAbsolute += Math.abs(A[i]-B[i]);
     }

     System.out.println("Min Absolute diff of pairs: "+minAbsolute);
    }
}
     

