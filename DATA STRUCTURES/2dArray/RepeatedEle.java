//count no.of times an given element is occur in matrix
public class RepeatedEle{

    public static void SearchInMatrix(int matrix[][],int key){

        int sum=0;
        
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==key){
                    sum++;
                }
            }
        }
        System.out.println("No of "+key+ " are : "+sum);
    }
    

    public static void main(String[] args) {
        int matrix[] [] = { {4,7,8},
                            {8,8,7},
                            };

     int key = 8;
    SearchInMatrix(matrix,key);                    
    }
}
