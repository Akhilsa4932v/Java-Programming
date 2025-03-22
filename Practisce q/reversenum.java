
public class reversenum{
    public static void main(String args[]){

        //1 approach
        int reverse = 0;
        int n = 10899;
        while(n>0){
                reverse = n % 10;
                System.out.print(reverse);
                n = n / 10;
        }
        
//2nd approach
         // int num = 10899;
        // int rev = 0;
        // while(num>0){
        //     int lastdi = num % 10;
        //     rev = (rev *10) + lastdi;
        //     num = num / 10;
        // }
        // System.out.print(rev);
    }
}