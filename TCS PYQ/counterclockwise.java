

public class counterclockwise {
    public static int[][] transpose(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;
    
        int transpose[][] = new int[col][row];
    
        for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
            transpose[j][i] = matrix[i][j];
          }
        }
    
        return transpose;
      }
    
      public static int[][] cc(int transpose[][]){
       
        for(int rev = 0;rev<transpose[0].length;rev++){
          for(int i=0,j=transpose.length-1;i<j;i++,j--){
            int temp = transpose[i][rev];
            transpose[i][rev] = transpose[j][rev];
            transpose[j][rev] = temp;
          }
            
          }
          return transpose;
        }
      
      public static void main(String args[]){
       
        int matrix[][] = {
                           {3,6,9},{2,5,8},{1,4,7}
        };
    
    
        int result[][] = cc(transpose(matrix));
    
        for(int i=0;i<result.length;i++){
          for(int j=0;j<result[0].length;j++){
            System.out.print(result[i][j]+" ");
          }
          System.out.println();
        }
}}
