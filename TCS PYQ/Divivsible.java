public class Divivsible {
    
    public static boolean divi(String str){
        int sum = 0;
        for(int i=0;i<str.length();i++){
          sum = sum + str.charAt(i)-'0';
        }
    
        return sum%9 == 0;
        }
      
    
      
      public static void main(String args[]){
      
        String str = "99333";
        System.out.println(divi(str));

}
}