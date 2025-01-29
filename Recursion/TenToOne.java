package Recursion;

//10 9 8 7 6 5 4 3 2 1

public class TenToOne {
    public static void printNum(int n){
        if(n==1){
            System.out.print(n);
            return;//it exits from the current method and stops the code execution.
        } 
        System.out.print(n+" ");
          printNum(n-1);
           
        }
    
        public static void main(String[] args) {
            printNum(10);
        }
}

// 1 2 3 4 5 6 7 8 9 10 
/*
public static void printNum(int n){

//logic 1

    if(n==10){
        System.out.print(n);
        return;
    } 
    System.out.print(n+" ");
      printNum(n+1);
       
    }

//logic 2

    if(n==1){
        System.out.print(n+" ");
        return;
    } 
        printNum(n-1);
        System.out.print(n+" ");
    }
    

    public static void main(String[] args) {
        printNum(10);
    }

    */