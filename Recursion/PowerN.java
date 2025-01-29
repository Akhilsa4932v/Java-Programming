package Recursion;

public class PowerN {
       // calculating x power n  ( 2^n = 2 * 2^n-1; eg: 2^10 = 2 * 2^9)

    //O(n) TC: 

    // public static int expo(int x, int n){

    //     if(n == 0){
    //         return 1;
    //     }
    //    return x * expo(x, n-1);
        
    
    // }

    //O(logn) tc:

    public static int exponential_optimise(int x,int n){

        if(n==0){
            return 1;
        }

        //for even power
        int halfPower = exponential_optimise(x, n/2);
        int halfPowersq = halfPower * halfPower;

        //for odd
        if(n % 2 != 0){
            halfPowersq = x * halfPowersq;
        }

        return halfPowersq;

    }

    public static void main(String[] args) {
        System.out.println(exponential_optimise(2,10));
    }

    }


