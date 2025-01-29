package Strings;

public class SubString {
    public static void Substring(String name , int startInd , int endIndex){
        String Sub = "";
        for(int i = startInd;i<endIndex;i++){
            Sub += name.charAt(i);
        }
        System.out.println(Sub);
    }

    public static void main(String[] args) {
        String name = "HelloWorld";
        Substring(name, 0, 3);
    }
}
