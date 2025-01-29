//creating 2d array , giving input and printing output

import java.util.*;
public class Basic2d{
    


    //to search an element in matrix
    public static boolean search(int matrix[][],int key){
        int n=matrix.length , m=matrix[0].length;
        for(int row = 0;row<n;row++){
            for(int col=0;col<m;col++){
                if(matrix[row][col]==key){
                    System.out.println(+key+" Found at ("+row+","+col+")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int  n=3, m=3; //no.of rows(n)=matrix.length ,no.of col(m)=matrix[0].length;

        //input
        for(int row = 0; row < n; row++){
            for(int col=0; col < m; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        //output(print matrix)
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
        //calling search function
        search(matrix, 9);
        

        sc.close();

    }
}

//find largest and smallest element in matrix

// import java.util.*;
// public class JavaBasic {

//     //Find larger element in matrix

//     public static void LargeElement(int matrix[][]){
//         int n=matrix.length , m=matrix[0].length;
//         int Large = Integer.MIN_VALUE;
//         for(int row = 0;row<n;row++){
//             for(int col=0;col<m;col++){
//                if(Large  < matrix[row][col]){
//                 Large = matrix[row][col];
//                }
//             }

//         }
//             System.out.println("Smallest element in matrix : "+Large);
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int matrix[][] = new int[3][3];
//         int  n=3, m=3; //n=matrix.length ,m=matrix[0].length;

//         //input
//         for(int row = 0; row < n; row++){
//             for(int col=0; col < m; col++){
//                 matrix[row][col] = sc.nextInt();
//             }
//         }

//         //output(print matrix)
//         for(int row=0;row<n;row++){
//             for(int col=0;col<m;col++){
//                 System.out.print(matrix[row][col]+" ");
//             }
//             System.out.println();
//         }
//         //calling search function
//         LargeElement(matrix);
        

//         sc.close();

//     }
// }