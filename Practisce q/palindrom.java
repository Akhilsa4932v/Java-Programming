import java.util.Scanner;
 public class palindrom{
   
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;
        while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }
    if (number == reverse) {
        return true;
        }
        return false;
}
   
    public static void main(String args[]) {
        System.out.println("Please Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome)) {
        System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
        System.out.println("Number : " + palindrome + " is not a palindrome");
        }
        sc.close();
    }
   
}


//my code:
// public class palindrom{

    

// public static void Palindrom(int n){
//     int num = n;
//     int rev = 0;
//     int pow = 0;
//     while (n>0) {
//         int lastdig = n%10;
//         rev = rev + (lastdig * (int)Math.pow(10,pow));
//         pow++;
//         n = n/10;   
//     }
//    System.out.println(rev);
//     if(rev==num){
//         System.out.println(+num+": is Palindrom number");
//     }else{
//         System.out.println(+num+": is not Palindrom number");
//     }
// // }
// public static void main(String args[]){
//     // Palindrom(323);
//     sumnum(2325);           
    
// }
// }
