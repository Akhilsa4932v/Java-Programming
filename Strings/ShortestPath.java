package Strings;
//directions problem

public class ShortestPath{

    //directions problem
    
    public static float Shortest___Path(String path){
        //defining x-cooardinate y-cooardinate;
        int x=0,y=0;

        for(int i=0;i<path.length();i++){
            char direction = path.charAt(i);

            //North
            if(direction =='N'){
                y++;
            }

            //south
            else if(direction =='S'){
                y--;
            }

            //west
            else if(direction =='W'){
                x--;
            }

            //east
            else{

                x++;
            }
        }
        int X2 = x*x; //as we calculate from(0,0) orign so x1,y1 == 0 so Math.sqrt((x2-0)^2+(y2-0)^2)  we get math.sqrt(x2^2 + y2^2) so ignore x1,y1....just sq the values of x,y calculate formula.
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    
    
}
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(Shortest___Path(path));
    }
}


