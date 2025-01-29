import java.util.ArrayList;

public class Operations {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();

        //operations in ArrayList

        //Add Elements to array list

        list1.add(6);
        list1.add(3);
        list1.add(0);
        list1.add(1);
        System.out.println(list1);

         //another add operation

        list1.add(1,50);
        System.out.println(list1);

        //get Elements from array list

        int ele = list1.get(2) ; //accesing the element at index 2;
        System.out.println(ele);

        //Remove element from the list

        list1.remove(2);        //deletw the element at index 2;
        System.out.println(list1);

        //set new element in place of old element.
        
        list1.set(1,10 );
        System.out.println(list1);


        //contains ( check wheather  an element exists or not)
        System.out.println(list1.contains(6));
        System.out.println(list1.contains(7));

       


        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(70);
        al.add(4);



        // //reverse print
        for(int i=al.size()-1;i>=0;i--){
            System.out.print(al.get(i)+" ");
        }

        //max num
        int max = Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++){
            // if(al.get(i)>max){
            //     max = al.get(i);
            // }
            max = Math.max(max, al.get(i));  //<---
        }
        System.out.println(max);
    }
    }

