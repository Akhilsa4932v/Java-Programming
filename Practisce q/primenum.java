///Model 1

// import java.util.*;
// public class primenum{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if(num == 2){
//             System.out.println(num+": is a prime number");
//         }
//         else{
//             boolean isprime = true;
//             for(int i = 2;i<=Math.sqrt(num);i++){
//                 if(num%i==0){ //n is multiple of i (i is not equal to 1 or n)
//                     isprime = false;
//                 }
//             }

//             if(isprime == true){
//                  System.out.println(num+": is a prime number");
//                 }
//             else{
//                 System.out.println(num+": is not  a prime number");
//                 }
            
//         }
//         sc.close();


//     }
// }
///Model 2


// public class primenum{

  
//     public static void main(String[] args) {
//          int num = 17;
//          boolean res = true;
//          for(int i=2;i<=11-1;i++){
//             if(num%i==0){
//                 res = false;
                //break;  //stop the loop while any first number is completely divisible by num;

//             }
         
//          }
//          if(res==true){
//             System.out.println("prime");
//          }
//          else{
//             System.out.println("Not prime");
//          }
//     }
// }

///Model 3

// public class primenum{

//     public static boolean isprime(int n){
//       if(n==2){
//           return true;
//       }
  
//       for(int i=2;i<=n-1;i++){   //optimised way : i=2 ; i<= math.sqrt(n) ; i++
//           if(n%i==0){
//               return false;
              
//           }
//       }
//       return true;
//     }
  
//       public static void main(String[] args) {
//           System.out.println(isprime(6));
         
//   }
//   }


//printing range of prime numbers upto n

public class primenum{


    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    

        public static void main(String[] args) {
            
        primeRange(20);
    }
    }