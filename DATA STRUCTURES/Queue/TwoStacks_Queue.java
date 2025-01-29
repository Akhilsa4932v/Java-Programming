// import java.util.*;

public class TwoStacks_Queue {
    
    /*
     * // implementation of queue using two stacks
public class Solution{

    public static class queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        //isEmpty
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        //enque--add
        public void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //dequeue -- remove
        public int remove(){
            if(s1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }

        //peek
        public int peek(){
            if(s1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            return s1.peek();
        }

    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
     */
}
