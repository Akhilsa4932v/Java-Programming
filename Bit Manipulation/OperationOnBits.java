

public class OperationOnBits {

//get ith bit
    public static int ith_Position(int n,int i){

        int bitmask = 1<<i;
        if((n & bitmask) == 0){
                return 0;
        }
        else{
                return 1;
        }
}

//OR

        public static void Ith_bit(int n,int i){

                int bitmask = n>>i;
                
                if( (1&bitmask) == 0){
                System.out.println('0');
                }else{
                System.out.println('1');
                }
        }

//set ith bit (setting a bit to 1)
        public static int set_ith_bit(int n,int i){
                
                int bitMask = 1<<i;
                return n | bitMask;
        }
//clear ith bit--make it 0 (setting a bit to 0)

        public static int clear_ith_bit(int n,int i){
        
        int bitMask = ~(1<<i);
        return n & bitMask;
      }

//Update ith bit   (setting a 0 bit to 1 || 1 bit to 0)
        public static int update_ith_bit(int n,int i,int newbit){
        
        if(newbit == 0){
            return clear_ith_bit(n,i);
        }
        else{
           return set_ith_bit(n, i);
        }
      }

//clear i bITS  //make bits to 0;
        public static int clear_i_bits(int n,int ivalue){
        
        int bitmask = (~0) << ivalue;
        return n & bitmask;
        }

public static void main(String[] args) {
      System.out.println( update_ith_bit(10, 1,0));
}
}
