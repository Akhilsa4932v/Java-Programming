package Recursion;

///removing duplicate string

public class Dup_String_remove {
    public static void removeDuplicate(String str, int idx , StringBuilder newStr , boolean map[] ){

        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
    
        char currchar = str.charAt(idx);
    
        if(map[currchar-'a'] == true){
    
            //duplicate
            removeDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[currchar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currchar), map);
        }
    
       }
    
       public static void main(String[] args) {

        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    
        //apncoleg.
       
       }
}


//2nd way
    // public static String checkDup(String str,int idx,StringBuilder newStr,boolean map[]){
    //     //base case
    //     if(idx==str.length()){
    //         return newStr.toString();
    //     }


    //     //kaam
    //     char currentChar = str.charAt(idx);
    //     if(map[currentChar - 'a'] == false){
    //         map[currentChar-'a'] = true;
    //         newStr.append(currentChar);
    //     }
    //     //recursion
    //     return checkDup(str, idx+1, newStr, map);
    // }
    
    // public static void main(String[] args) {
    // String str = "aakhill";
    // System.out.println(checkDup(str, 0, new StringBuilder(),new boolean[25]));

    // }