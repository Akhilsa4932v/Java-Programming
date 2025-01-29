// public class  DoublyLinkedList{

//   public static class Node{
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     //addFirst
//     public void addFirst(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head == null){
//             head=tail=newNode;
//             return;
//         }
       
//         newNode.next = head;
//         head.prev = newNode;
//         head = newNode;

//     }
//     //removeFirst

//     public int removeFirst(){
        
//         if(head==null){
//             System.out.println("Dll is empty");
//             return Integer.MIN_VALUE;
//         }
//         if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size--;
//             return val;
//         }
//        int val = head.data;
//        head = head.next;
//        head.prev = null;
//        size--;
//        return val;


//     }

//     //addLast
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head ==null){
//             head = tail = newNode;
//             return;
//         }
       
//        tail.next = newNode;
//        newNode.prev = tail;
//        tail = newNode;

//     }

//     //remove last

//     public int removeLast(){
//         if(size==1){
//             int val=head.data;
//             head=null;
//             size--;
//             return val;
//         }
//         int val=tail.data;
//         tail=tail.prev;
//         tail.next=null;
//         size--;
//         return val;
//     }

//     //print
//     public void print(){
//         Node temp = head;
//         if(head==null){
//             System.out.println("null");
//             return;
//         }
//         while(temp!=null){
//             System.out.print(temp.data+"<->");
//             temp = temp.next;
//         }
//         System.out.println("Null");
        
//     }


//     public static void main(String[] args) {

//         DoublyLinkedList dll = new DoublyLinkedList();
//         dll.addFirst(2);
//         dll.addFirst(1);
//         dll.print();
      
//         System.out.println(dll.size);
//         dll.addLast(3);
//         dll.print();
//         dll.removeLast();
//         dll.print();

//         System.out.println(dll.size);


        
//     }
// }
