public class Sumof2ndRow {
    
    //11+4+3 = 18;
    public static int sum2row(int matrix[][]){
        int sum = 0;

        for(int col=0;col<matrix[0].length;col++){
            sum+=matrix[1][col];
        }
        return sum;
    }
        
    
    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(sum2row(matrix));

    }
}
