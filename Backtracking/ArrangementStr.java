package Backtracking;

//finding arrangerment of string  = permutations
public class ArrangementStr {
    public static void Permuitation(String str,String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //reccursion -- O(n*n)
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde" = "ab"+"de"
            String newStr = str.substring(0,i) + str.substring(i+1);
            Permuitation(newStr, ans+curr);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        Permuitation(str, "");
    }
}
