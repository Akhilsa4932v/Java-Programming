package OOPS;

//Compile - time polymorphism achieved by method overloading

public class Polymorphism {

    public class CompileTimePolymorphismDemo {
        public static void main(String[] args) {
            MathOperations math = new MathOperations();
            System.out.println(math.add(10, 20));         // Calls the first add method
            System.out.println(math.add(10, 20, 30));     // Calls the second add method
            System.out.println(math.add(10.5, 20.5));     // Calls the third add method
        }
    }
}
    class MathOperations {
        // Overloaded method with two int parameters
        int add(int a, int b) {
            return a + b;
        }
    
        // Overloaded method with three int parameters
        int add(int a, int b, int c) {
            return a + b + c;
        }
    
        // Overloaded method with two double parameters
        double add(double a, double b) {
            return a + b;
        }
    }
    
    // In this example, the add method is overloaded with different parameter lists.
    
//runtime polymorphism achieved by method overriding

/* 
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Calls the Dog's overridden method
        myCat.sound(); // Calls the Cat's overridden method
    }
}

//In this example, the sound method is overridden in both Dog and Cat classes. The actual method that gets called is determined at runtime based on the object type.
*/
