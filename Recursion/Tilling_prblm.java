package Recursion;

public class Tilling_prblm {
    //Amazon problem ---  take a  look day 19  recursion 
    public static int tilling(int n ){ //2 x n floor size

        if(n==0 || n==1){
            return 1;
        }

        //VERTICAL CHOICE
        int fnm1 = tilling(n-1);

        //HORIZONTAL CHOICE
        int fnm2 = tilling(n-2);

        int Totalways = fnm1 + fnm2;
        return Totalways;
    }

    public static void main(String[] args) {
        System.out.println(tilling(4));
    }
}
