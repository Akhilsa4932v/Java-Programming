import java.util.ArrayList;
import java.util.Collections;

// collection--->Interface;
// collections--->class; //use this one

public class Sort {
    



    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(130);
        list.add(20);

        System.out.println(list);

        //ascending order
        Collections.sort(list);
        System.out.println(list);

        //descending order
        Collections.sort(list,Collections.reverseOrder());  //here collection.reverseOrder is a comparitor that defines the logic of the function eg: wheather sorting should be in asce or desc.
        System.out.println(list);
    }
}
