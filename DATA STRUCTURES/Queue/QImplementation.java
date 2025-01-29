 //*********queue*******  ,circular queue implementation in array
/* 
public class QImplementation {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        //isEmpty
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        //isfull
        public static boolean isfull(){
            return (rear+1)%size == front;
        }

        //add
        public static void add(int data){
            if(isfull()){
                System.out.println("Queue is full");
                return;
            }
            //add 1st element
            if(front == -1){
                front = 0;  
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            
            int result = arr[front];
            //last ele delete
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        //peek
        public  static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return  arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);


        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
 */
/*//*************linkedlist************** implementation of queue.

public class QImplementation{

    static class Node {
        int data;
        Node  next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        
        //isEmpty
        public static boolean isEmpty(){
            return head == null && tail == null;
        }


        //add
        public static void add(int data){
         
            Node newNode = new Node(data);
            if(head == null){
                head=tail=newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            
           int front = head.data;

          //single element
          if(tail == head){
            tail=head=null;
          }else{
            head = head.next;
          }

          return front;
        }

        //peek
        public  static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return  head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);


        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
} */


//implementing queue by ******************ARRAY************************ ;

// public class Solution{
//     //queue class
//     static class Queue{
//        static int arr[];
//        static int size;
//        static int rear;
//        static int front;

//        Queue(int n){
//            arr = new int[n];
//            size = n;
//            rear = -1;
//        }

//          //isEmpty
//     public static boolean isEmpty(){
//        return rear == -1;
//     }

//        //add
//    public static void add(int n){
//        if(rear==size-1){
//            System.out.println("Queue is full");
//            return;
//        }
//        rear = rear + 1;
//        arr[rear] = n;

//    }

//    //remove
//    public static int remove(){
       
//        if(isEmpty()){
//            System.out.println("Empty queue");
//            return -1;
//        }

//        front = arr[0];
//        for(int i=0;i<rear;i++){
//            arr[i] = arr[i+1];
//        }
//        rear = rear-1;
//        return front;
       
       
//    }

//    //peek
//    public static int peek(){
//        if(isEmpty()){
//            System.out.println("queue is empty");
//            return -1;
//        }
//        return arr[0];
      
       
       
//    }

// }

// public static void main(String[] args) {
//    Queue q = new Queue(3);
//    q.add(1);
//    q.add(2);
//    q.add(3);

//    while (!q.isEmpty()) {
//        System.out.println(q.peek());
//        q.remove();
//    }
// }

  


//implementing queue by ******java collection****** framework 
/*import java.util.*;

public class Qimplementation{
    

    public static void main(String[] args) {
      
    Queue<Integer> q = new LinkedList<>();
    //or
    // Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);


        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

    
}*/

