
//implementing stack using ************ArrayList***************.

/*import java.util.ArrayList;

public class StackImplementation{



static class stack{
        static ArrayList<Integer> list = new ArrayList<>();


        //isEmpty
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push
        public static void push(int num){
            list.add(num);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek-to get last ele in stack
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
       stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }

*/

// stack implementation using **********linnkedlist**************
/*
public class StackImplementation{
    static class Node{
       int data;
       Node next;

       public Node(int Data){
            this.data = Data;
            next = null;
       }
   }

   static class stack{
       static Node head = null;

       //ISEMPTY
       public static boolean isEmpty(){
           return head==null;
       }

       //push
       public static void push(int data){
           Node newNode = new Node(data);
           if(isEmpty()){
               head = newNode;
               return;
           }
           newNode.next = head;
           head = newNode;

       }

       //pop
       public static int pop(){
           if(head==null){
               return -1;
           }
           int top = head.data;
           head = head.next;
           return top;
       }

       //peek
       public static int peek(){
           if(head==null){
               return  -1;
           }
           return head.data;
       }


   }

   public static void main(String[] args) {
       stack s = new stack();
       s.push(3);
       s.push(2);
       s.push(5);

       while(!s.isEmpty()){
           System.out.println(s.peek());
           s.pop();
       }
       System.out.println(s.peek());
   }
}
*/


// stack implementation using **********Java Collection FrameWork**************
/*import java.util.*;

public class StackImplementation{
     
    public static void main(String[] args) {
       Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}*/