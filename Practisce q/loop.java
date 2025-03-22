import java.util.*; 
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int num = 1;
        // while(num<=10){
        //     System.out.print(num+" ");
        //     num++;
        // }

        // int num = sc.nextInt();
        // int n = 1;
        // while(n<=num){
        //     System.out.print(n+" ");
        //     n++;
        // }
        int n = 5;
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum + i;
            i++;

        }
        System.out.println(sum);
        sc.close();
        
    }
}

//Q

// import java.util.*; 
// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//        int j = 1;
//         while(j<=4){
//             System.out.println("* * * *"+" ");
//             j++;
//            }
              
//         sc.close();
        
//     }
// }