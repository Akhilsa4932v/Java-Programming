package Strings;

//best one

public class Palindrom {
    public static boolean CheckPalindrom(String name){
        for(int i=0;i<name.length()/2;i++){
            int n=name.length();
            if(name.charAt(i) != name.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    //approach 1

    // public static void CheckPalindrom(){
    //     String name = "noon";
    //     String str = "";
    //     for(int i=name.length()-1;i>=0;i--){
    //         str += name.charAt(i);
    //     }
        
    //     if(str.equals(name)){
    //         System.out.println(name+" is Palindrom");
    //     }
    //     else{
    //         System.out.println("no");
    //     }

        //approach 2

        // public static void CheckPalindrom(){

        // String name  = "noon";
        // boolean result = false;
        // int s = 0;
        // int e = name.length()-1;
        // for(int i =0; i<= name.length()/2; i++){
        //     if(name.charAt(s) == name.charAt(e)){
        //         result = true;
        //     }
        //     s++;
        //     e--;
        // }
        // if(!result){
        //     System.out.println("not");
        // }
        // else{
        //     System.out.println("palindrome");
        // }

    //  }

    public static void main(String[] args) {

      String name = "racear";
      System.out.println(CheckPalindrom(name));
    }
}

