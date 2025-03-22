import java.util.*;
public class oddevensum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long num = 246135;
        int even = 0;
        int odd = 0;

        while (num>0) {
            int lastdig = (int) (num % 10);
            if(lastdig % 2 == 0){
                even = even + lastdig;
            }
            else{
                odd = odd + lastdig;
            }
            num = num / 10;
            
        }

        System.out.println("Even sum = "+even);
        System.out.println("Odd sum = "+odd);

sc.close();;
        
    }
}