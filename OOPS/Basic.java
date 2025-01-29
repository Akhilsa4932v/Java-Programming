package OOPS;

public class Basic {
    

        public static void main(String[] args) {
                pen p1 = new pen();
                p1.setColor("Black");
                System.out.println(p1.color);
                p1.settip(2);
                System.out.println(p1.tip);
        }
}

class pen{
        String color;
        int tip;

        void setColor(String newcolor){
                color = newcolor;
        }

        void settip(int newtip){
                tip = newtip;
        }
}

