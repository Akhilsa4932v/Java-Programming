package Recursion;

public class Factorial {
   

        public static int factorial(int n){
            if(n<0){
                return -1;
            }
            if(n==0){
                return 1;
            }
    
            return n*factorial(n-1);
        }
        
        public static void main(String[] args) {
    
            int result = factorial(5);
            if (result==-1) 
            {
                System.out.println("Invalid input: Factorial is not defined for negative numbers.");
                
            }
            else{
                System.out.println(result);
            }
    
        }
}

//using for loop

    /*
            int n = 5;
            int res = 1;
            if(n==1 || n == 0){
                System.out.println(0);
            }
            for(int i=2;i<=n;i++){
                res = res * i;
            }
            System.out.println(res);
        }
    */


 //sum of n natural numbers

    /* 
    public static int sumOfN(int n){
    
        if(n==1){
            return 1;
        }
    int prv = sumOfN(n-1);
    int res = n + prv;
    return res;

    //or 

    //    if(n==1){
    //     return 1;
    //    }

    // return n + sumOfN(n-1);


    }
    public static void main(String[] args) {
        
    int rs = sumOfN(3);
    System.out.println(rs);
    }
    }
    */