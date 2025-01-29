public class DiagonalSum {


       
   
//O(N^2)

// public static int diagonalSum(int matrix[][]){
//     int sum = 0;
//     for(int row=0;row<matrix.length;row++){
//         for(int col=0;col<matrix[0].length;col++){
//             if(row==col){
//                 sum  = sum + matrix[row][col];
//             }

//             else if(row+col == matrix.length-1){
//                 sum = sum + matrix[row][col];
//             }
//         }
//     }
//     return sum;
    
// }
   
//O(N)
public static int diagonalSum(int matrix[][]){

    int sum=0;
    for(int row = 0;row<matrix.length;row++){

    //primary diagonall sum
    sum = sum + matrix[row][row];

    //secondary diagonal
    //as we know each box of secondary diagonal in form of (row+col) = n-1  , so col = n-1-row;
    int col = matrix.length-1-row;
    if(row!=col){
        sum = sum + matrix[row][col];
    } 
}
return sum;
}


    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

System.out.println(diagonalSum(matrix));
       
    }


       
}
