import java.util.ArrayList;

public class PairSum {
     //O(n^2)
     public static void Pairs(ArrayList<Integer> arr){
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                sum = arr.get(i)+arr.get(j);
                if(sum==5){
                    System.out.println("("+arr.get(i)+","+arr.get(j)+")=>"+sum);
                    return;
                }
                
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);


        Pairs(arr);
    }
}


//2 pointer approach  in sorted arrayList.

//   public static boolean Pairs(ArrayList<Integer> arr){
//     int i=0;
//     int j=arr.size()-1;

//     while (i!=j) {
//         if(arr.get(i)+arr.get(j) == 5){
//             return true;
//         }

//         // case1
//         if(arr.get(i)+arr.get(j) >  5){
//             j--;
//         }

//         //case 2
//         if(arr.get(i)+arr.get(j) < 5){
//             i++;
//         }
//     }
//     return false;
// }

// public static void main(String[] args) {
// ArrayList<Integer> arr = new ArrayList<>();
// arr.add(1);
// arr.add(2);
// arr.add(3);
// arr.add(4);
// arr.add(5);


// System.out.print( Pairs(arr));
// }


// Pair sum for sorted and rotated array O(N);

// public static boolean PairsSum(ArrayList<Integer> arr){
//     int bp = -1; //breakpoint

//     for(int i=0;i<arr.size();i++){
//         if(arr.get(i)>arr.get(i+1)){
//             bp = i;
//             break;
//         }
//     }
//     int n = arr.size();
//     int lp = bp+1;
//     int rp = bp;

//     while (lp != rp) {
//         if(arr.get(lp)+arr.get(rp) == 16){
//             return true;
//         }
//         else if(arr.get(lp)+arr.get(rp) > 16){
//             rp = (n+rp-1) % n;
//         }else{
//             lp = (lp+1) % n;
//         }
//     }

//     return false;
// }


// public static void main(String[] args) {
// ArrayList<Integer> arr = new ArrayList<>();
// arr.add(11);
// arr.add(15);
// arr.add(6);
// arr.add(8);
// arr.add(9);
// arr.add(10);


// System.out.print( PairsSum(arr));
// }
// }