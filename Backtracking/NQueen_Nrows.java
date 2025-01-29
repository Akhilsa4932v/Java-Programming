package Backtracking;

//1.placing n queens in n rows;
public class NQueen_Nrows {
       public static void nqueens(char chessBoard[][],int row){

        if(row==chessBoard.length){
            printChessBoard(chessBoard);
            return;
        }

        for(int j=0;j<chessBoard.length;j++){
            chessBoard[row][j] = 'Q';
            nqueens(chessBoard,row+1);
            chessBoard[row][j] = '.';

        }
    }

    public static void printChessBoard(char chessBoard[][]){
        System.out.println("----------chess board-----------");
       for(int i=0;i<chessBoard.length;i++){
        for(int j=0;j<chessBoard.length;j++){
            System.out.print(chessBoard[i][j]+" ");
        }
        System.out.println();
       }
    }


    
    public static void main(String[] args) {
       int  n = 2;
       char chessBoard[][] = new char[n][n];

       for(int i=0;i<chessBoard.length;i++){
        for(int j=0;j<chessBoard.length;j++){
           chessBoard[i][j]='.';
        }
       }
       nqueens(chessBoard,0);
    }
}
