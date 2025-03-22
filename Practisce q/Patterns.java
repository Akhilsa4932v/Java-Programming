// * * * * * 
// *       *
// *       *
// * * * * *

// public class Patterns {
//     public static void hollow_rectangle(int totRows,int totalCols){
//         //outerloop
//         for(int i=1;i<=totRows;i++){
//             //inner-coloumns
//             for(int j=1;j<=totalCols;j++){
//                 //cell-(i,j)
//                 if(i==1 || i==totRows || j==1 || j==totalCols){
//                     //boundary cell
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         hollow_rectangle(4,5 );
//     }
// }

// *
// **
// ***
// ****

public class Patterns{
    public static void Pyramid(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pyramid(4);
    }
}

// *****
// ****
// ***
// **
// *

// public static void pyramid_up_down(int n){
//     for(int line=1;line<=n;line++){
//         for(int star=n;star>=line;star--){
//             System.out.print("*");
//         }
//        
//         System.out.println();
//     }
// }
// 1 
// 1 2
// 1 2 3
// 1 2 3 4

// public class Patterns{
//     public static void main(String args[]){
//         int num=1;
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(+num +" ");
//                 num++;
//             }
//             System.out.println();
//             num=1;
//         }
//     }
// }



// 2nd logic
// public class Patterns{
//     public static void main(String args[]){
        
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
               
//             }
//             System.out.println();
            
//         }
//     }
// }

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// public static void floyds(){
//     int num = 1;
//     for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(num+" ");
//             num++;
          
//         }
//         System.out.println();
//     }
// }


// A
// BC
// DEF
// GHIJ
// public class JavaBasic{
//     public static void main(String args[]){
//         char ch='A';
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;
               
//             }
//             System.out.println();
            
//         }
//     }
// }


//      *
//     **
//    ***
//   ****
//
// public static void invewrtedHalfPy(int r , int c){
//     //outerLoop
//     for(int i=1;i<=r;i++){

//         //loop to print spaces
//         for(int s = 1;s<=r-i;s++){
//             System.out.print(" ");
//         }
//         //loop to print stars
//         for(int j = 1;j<=i;j++){
//             System.out.print('*');
//         }

//         System.out.println();
//     }
// }

// public static void main(String[] args) {
 
//   invewrtedHalfPy(4, 4);
// }

// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// public static void binaryPattern(){
      
//     for(int i=1;i<=5;i++){
//         for(int j=1;j<=i;j++){
            
//            if((i+j)%2 == 0 ){ //even
//             System.out.print("1"+" ");
//            }else{
//             System.out.print("0"+" ");
//            }
//         }
//         System.out.println();
//     }
// }

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
// public static void butterfly(int n){
//     //1st half

//         //outer loop
//         for(int i=1;i<=n;i++){
//             //inner loop

//             //stars
//             for(int star=1;star<=i;star++){
//                 System.out.print('*');
//             }
//             //spaces
//             for(int space=1;space<=2*(n-i);space++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int star=1;star<=i;star++){
//                 System.out.print('*');
//             }
//             System.out.println();
//         }
//     //2nd  half

//         //outer loop
//         for(int i=n;i>=1;i--){
//             //inner loop

//             //stars
//             for(int star=1;star<=i;star++){
//                 System.out.print('*');
//             }
//             //spaces
//             for(int space = 1;space<=2*(n-i);space++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int star=1;star<=i;star++){
//                 System.out.print('*');
//             }
//             System.out.println();
// }
//      *****
//     *****
//    *****
//   *****
// public static void rhombus(int n){
//     for(int i=1;i<=n;i++){

//         //spaces
//         for(int space=1;space<=n-i;space++){
//             System.out.print(" ");
//         }
//         //stars
//         for(int star=1;star<=5;star++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }


//      *****
//     *   *
//    *   *
//   *   *
//  *****

// public static void hollow_Rhombus(int n){
//     //outer loop
//     for(int i=1;i<=n;i++){
//     //inner

//         //spaces
//         for(int space=1;space<=(n-i) ; space++){
//             System.out.print(" ");
//         }
//         //stars
//         for(int star=1;star<=n;star++){
//             if(i==1||i==n||star==1||star==n){
//                 System.out.print('*');
//             }else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
// }


//      *
//     ***
//    *****
//   *******
//   *******
//    *****
//     ***
//      *
// public static void diamond(int n){
//     //1st half
//         for(int i=1;i<=n;i++){
    
//             //space
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int stars=1;stars<=(2*i-1);stars++){
//                 System.out.print('*');
//             }
//             System.out.println();
           
//         }
//     //2nd half
//             for(int i=n;i>=1;i--){
    
//                 //space
//                 for(int j=1;j<=(n-i);j++){
//                     System.out.print(" ");
//                 }
//                 //stars
//                 for(int stars=1;stars<=(2*i-1);stars++){
//                     System.out.print('*');
//                 }
//                 System.out.println();
            
//             }
//     }