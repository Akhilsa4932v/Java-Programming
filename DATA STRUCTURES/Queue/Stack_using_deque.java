// import java.util.*;
// import java.util.LinkedList;

 //implement QUEUE AND STACK using deque.


public class Stack_using_deque {

//implement stack using deque.
    /*
     static class stack{
        Deque<Integer> dq = new LinkedList<>();

        public  boolean isEmpty(){
            return dq.isEmpty();
        }

        public void push(int data){
            dq.addLast(data);
        }

        public int pop(){
            if(dq.isEmpty()){
                System.out.println("empty dq");
                return -1;
            }

            return dq.removeLast();
        }

        public int peek(){
            return dq.getLast();
        }
    }
  
    public static void main(String[] args) {
        stack s = new stack();
        
        for(int i=1;i<7;i++){
            s.push(i);
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
    

 //implement QUEUE using deque.

    static class queue{
        Deque<Integer> dq = new LinkedList<>();

        public  boolean isEmpty(){
            return dq.isEmpty();
        }

        public void add(int data){
            dq.addLast(data);
        }

        public int remove(){
            if(dq.isEmpty()){
                System.out.println("empty dq");
                return -1;
            }

            return dq.removeFirst();
        }

        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        queue q = new queue();

        //add ele
        for(int i=1;i<7;i++){
            q.add(i);
        }

        System.out.println(q.peek());

        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
    */
}
