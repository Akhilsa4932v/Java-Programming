

public class Entirerowandcolumnto0 {
    
     //Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

    //You must do it in place.

 

    public static void matrixz(int matrix[][]){

        boolean firstrow = false , firstcol = false;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]==0){
                    if(i==0) firstrow = true;
                    if(j==0) firstcol = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                 }
            }
        }

        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstrow){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }

        if(firstcol){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }


        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }


    }
       

    public static void main(String args[]){
  
       int matrix[][] = {

                    {1,1,1},{1,0,1},{1,1,1}
      
       };

       matrixz(matrix);


    /* i/p:
       1 1 1 
       1 0 1
       1 1 1
    
    o/p:
        1 0 1
        0 0 0
        1 0 1

        
*/
    }
}
