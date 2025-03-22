public class BintoDec {
    public static void bintodec(int bin){
        int mynum = bin;
        int dec = 0;
        int pow = 0;
        
        while (bin>0) {
         int lasdig = bin%10;
         dec = dec+(lasdig * (int)Math.pow(2,pow));  //math.pow takes and returns a double value so convert to int .
         pow++;
         bin = bin/10;
         
        }
        System.out.println("Decimal of "+mynum+" is: "+dec);
    }
    public static void main(String[] args) {
          bintodec(111);

    }

}

//decimal to binary:
// public class BintoDec{
//     public static void dectobin(int dec){
//         int mynum = dec;
//         int bin = 0;
//         int pow = 0;
        
//         while (dec>0) {
//          int lasdig = dec % 2;
//          bin = bin + (lasdig * (int)Math.pow(10,pow));
//          pow++;
//          dec = dec / 2;
         
//         }
//         System.out.println("Binary of "+mynum+" is: "+bin);
//     }
//     public static void main(String[] args) {
//           dectobin(7);

//     }
// }