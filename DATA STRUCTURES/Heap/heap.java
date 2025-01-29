import java.util.*;
//implementing min heap.
public class heap{

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        //add new node in heap.
        public void add(int data){
            arr.add(data);

            int x = arr.size()-1; //child index
            int parent = (x-1)/2; //parent index

            while (arr.get(x)<arr.get(parent)) {
                //swap

                int temp = arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent, temp);
            }

        }

        //to get min value
        public int peek(){
            return arr.get(0);
        }
    }
    public static void main(String[] args) {
        
    }
}