public class Armstrong {
    public static boolean isArmstrong(int num){

        int n = num;
        int sum = 0;
        while (n>0) {
          int ld  = n%10;
          sum += (int)Math.pow(ld, 3);
          n = n/10;
        }
        return sum==num;
      }
      public static void main(String args[]){
      int num = 100;
      System.out.println(isArmstrong(num));
      }    
}
