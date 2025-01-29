
public class OddEvn {

    public static void Odd_Even(int n){
            int bitmask = 1;
            if((n & bitmask) == 0){
                    System.out.println("Even number");

            }
            else{
                    System.err.println("Odd number");
            }
    }

    public static void main(String[] args) {
            Odd_Even(4);
    }
}

