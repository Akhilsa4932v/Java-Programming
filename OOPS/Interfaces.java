package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Elephant e1 = new Elephant();
        e1.moves();

        Bear b1 = new Bear();
        b1.grass();
    }
}

interface Chess{
    void moves(); //interface methods are by default public,abstract,without implementation
}

class Queen implements Chess{
    public void moves(){            //as the class implements interface so its method should be public;
        System.out.println("up,Down,left,right,diagonal");
    }
}


class Elephant implements Chess{
    public void moves(){
        System.out.println("top,left,right");
    }
}




//multiple inheritence

interface Herbivour{
    void grass();
      
}
interface Carnivour{
    void meat();
}

class Bear implements Herbivour, Carnivour{
    String color;

    public void grass(){
        System.out.println("eats grass");
    }

    public void meat(){
        System.out.println("eats meat");
    }
}

