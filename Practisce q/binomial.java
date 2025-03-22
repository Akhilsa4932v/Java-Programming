public class  binomial{


    public static int  factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }

        return fact;
    }

    //binomial coffecient
    public static int binomalCoeff(int n,int r){
        int fact_N = factorial(n);
        int fact_R = factorial(r);
        int fact_NmR = factorial(n-r);

        int binomialCoeff = fact_N / (fact_R*fact_NmR);

        return binomialCoeff;
    }

    public static void main(String[] args) {

        System.out.println(binomalCoeff(5, 2));
    }
}