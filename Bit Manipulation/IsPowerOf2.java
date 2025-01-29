public class IsPowerOf2 {


    public static boolean powerof2(int n){
        return (n & (n-1)) == 0;
       }
            
    public static void main(String[] args) {
        System.out.println(powerof2(5));
    }
    }
