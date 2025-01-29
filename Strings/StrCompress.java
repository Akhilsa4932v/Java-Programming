package Strings;

public class StrCompress {
    

    public static String String_Compression(String str){

        String newstr = "";
       
        for(int i=0;i<str.length();i++){
            Integer Count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {

                Count++;
                i++;
                
            }
            newstr += str.charAt(i);
            if(Count > 1){
                newstr += Count;
            }

        }

        return newstr.toString();
    }

    public static void main(String[] args) {
        System.out.println(String_Compression("abc"));
    }
}

