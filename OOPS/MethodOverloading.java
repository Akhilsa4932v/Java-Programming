package OOPS;

public class MethodOverloading {
    
//method overloading
        public static void main(String[] args) {
            Calculator c = new Calculator();
            System.out.println(c.sum(2,5));
            System.out.println(c.sum((float)2.5,(float)2.5));  //by default java consider decimal value as double. so converting to float
            System.out.println(c.sum(2,5,7));
        }
    }
    
    class Calculator{
    
        int sum(int a,int b){
            return a+b;
        }
        float sum(float a,float b){
            return a+b;
        }
        int sum(int a,int b,int c){
            return a+b+c;
        }
    }

    
//method overriding

//    public static void main(String[] args) {
        
//     Animal snake = new Animal();
//     snake.eat();
//     //there are two function of same name eat but ,  object which is created from the class,that class eat  function will exeute.
// }
// }



// //method overriding

// class Animal{
// void eat(){
//     System.out.println("eats animals");
// }
// }

// class Dog extends Animal{
// void eat(){
//     System.out.println("eats dog");
// }
// }
