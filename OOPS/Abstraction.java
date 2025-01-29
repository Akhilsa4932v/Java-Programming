package OOPS;

public class Abstraction {
    
    public static void main(String[] args) {
        // Mustang m = new Mustang();
  }
}

abstract class Animal{

  //constructor
  Animal(){
        System.out.println("Animal called");
  }

  //defined an abstract function
  abstract void walk();
}

class Horse extends Animal{

  Horse(){
        System.out.println("Horse called");
  }

  //implimentation of the abstract class Function
  void walk(){
        System.out.println("horse walks");
  }
}

class Mustang  extends Horse{

  Mustang(){
        System.out.println("Mustang called");
  }
  String color ;
}

