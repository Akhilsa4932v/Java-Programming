// package ArrayList;

import java.util.ArrayList;
public class swap{

    public static void s_wap(ArrayList<Integer> list,int idx1,int idx2){

        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);
    }
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int idx1 = 1,idx2 = 3;
        System.out.print(list);
        s_wap(list, idx1, idx2);
    }
}