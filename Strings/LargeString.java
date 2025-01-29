package Strings;
 
//using lexicographic. and compare to function.
public class LargeString {
    
 public static void main(String[] args) {
    String fruits[] = {"ap","man","b"};
    String  strLarge = fruits[0];
    for(int i=0;i<fruits.length;i++){

        if( strLarge.compareTo(fruits[i]) < 0){
            strLarge = fruits[i];
        }
    }
    System.out.println(strLarge);
 }
}
