public class SearchInMatrix {

    //search in sorted matrix;

    public static boolean Search_Key_In_Matrix(int matrix[][],int key){

    int row=0 , col = matrix[0].length-1;

    while(row<matrix.length && col>=0){

        if(matrix[row][col] == key){
            System.out.println("Key found at: ("+row+ ","+col+")");
            return true;
        }
        else if(key > matrix[row][col]){
            row++;
        }
        else{
            col--;
        }

    }
    System.out.println("Key not found");
    return false;

    }
    

    public static void main(String[] args) {
        int matrix[] [] = { {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16},
                            };

     int key = 11;
     Search_Key_In_Matrix(matrix,key);                    
    }
}

