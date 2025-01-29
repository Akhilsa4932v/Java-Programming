public class count_Set_Bits {
    
    //count no of 1's in the binary format of given number ex 10 --> 1010 ans = 2
    
   public static int countSetBits(int n){
    int count =0;
    while(n>0){
        if((n & 1) != 0 ){
            count++;
        }
        n = n>>1;
    }
    return count;
}
    
public static void main(String[] args) {


System.out.println(countSetBits(7));
}
}
