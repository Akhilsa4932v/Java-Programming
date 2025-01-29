public class LinkedList{
    //Basic operations of linkedlist.

    
    //Blue Print of Node.

public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; //all changes to size of linkedlist will apply on this size variable. initially 0;

    //add node at first--O(1)

    public void addFirst(int data){

        //create a node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
 
        newNode.next = head;
        head = newNode;
    }

     //add node at Last-O(1)
    public void addLast(int data){
        //create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
         head = tail = newNode;
         return;
        }

        tail.next = newNode;
        tail = newNode; 
    }

    //print LinkedList
    public void print(){
        if(head == null){
            System.out.println("Null");
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    //add node in the middle  --- to search the index - -O(n) to add new node at that position O(1).

    public void add(int idx,int data){
     
     //means adding new node at starting
     if(idx==0){
        addFirst(data);
        return;
     } 
     
     Node newNode = new Node(data);
     size++;

     Node temp = head;
     int i=0;
     while(i<idx-1){
        temp = temp.next;
        i++;
     }
     //i = idx-1 means temp is at prev node
     newNode.next = temp.next;
     temp.next = newNode;

    }

    //remove node at first
    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //remove node at last position
    public int removeLast(){

        
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }

        else if(size==1){
            int val = head.data;
            head=tail=null;
            size = 0;
            return val;
        }

        Node prev = head;
        //prev-Node for last node is = size-2 or (n-2)
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    //searck in linked list.
    public int iteSearch(int key){ //ite = iterative o(n)

        Node temp = head;
        int i = 0;
        while (temp!=null) {
            if(temp.data == key){//key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    //or
    public int search(int key){
        if(size==0){
            return -1;
        }
        Node temp = head;
        for(int i=0;i<size;i++){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
    
        }
        return -1;
    }

    //recursive search

    public int helper(Node head,int key){ //o(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){ //key not found case
            return -1;
        }
        
        return idx+1;
    }
  //OR
    public int recSearch(Node temp , int key,int idx){
    
        if(temp==null){
            return -1;
        }
        else if(temp.data == key){
            return idx;
        }
        return recSearch(temp = temp.next, key, idx+1);
    }
// System.out.println(ll.recSearch(head, 1, 0));


    //reverse a linkedlist
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        head = prev;
    }

    //find and delete nth node from last
    public void deleteNthNode(int n){
        //calc size of ll
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        //to remove first node
        if(n==size){
            head = head.next;
            return;
        }

        //size-n
        int i = 1;
        int iToFind = size-n;
        Node prev =  head;
        while (i<iToFind) {
            prev = prev.next;
            i++;
            
        }
        prev.next = prev.next.next;
        return;
    }

    //find mid node by slow-fast approach

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next; //+1
            fast = fast.next.next;//+2
             
        }
        return slow; //slow is my midNode
    } 

    //checking the ll is palindrom or not
    public Boolean checkPalindrom(){

        if(head == null || head.next == null){
            return true;
        }
        //step1 - find mid node
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        Node right = prev; //right half head
        Node left = head;

        //step3-check left half &  right half
        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    //detecting cycle in linkedlist
    public static boolean dtectCycle(){ //floyd's cycle finding algo.
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if(slow==fast){
                return true; //cycle exists
            }
        }

        return false;
    }

    // Constructing a LinkedList with loop

    // public static void main(String[] args) {
    //     head = new Node(1);
    //     head.next = new Node(2);
    //     head.next.next = new Node(3);
    //     head.next.next.next = head;
 
    //     System.out.println(dtectCycle());
    //  }

//detecting and remove  cycle in linkedlist
    public static void removeCycle(){

        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if(slow==fast){
                cycle=true;
                break; //cycle exists
            }
        }
        if(cycle == false){
            return;
        }
        //find meeting point

        slow=head;
        Node prev = null;//last node
        while (slow != fast) {
            prev=fast;
            slow = slow.next;
            fast = fast.next;
         }
         //remove cycle --> lastNode.next = null
           prev.next = null;



    }
    //find mid
   private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1!=null && head2!=null) {
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
           
        
            while (head1!=null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
        }
        while (head2!=null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    //Merge Sort

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        //find mid
        Node mid = getMid(head);
        //left and right merge sort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newright = mergeSort(rightHead);

        return merge(newLeft,newright);

    }


// ZIG-ZAG LINKEDLIST

   
// public void ZIGZAG(){
   
//     //find mid

//         Node slow = head;
//         Node fast = head.next;

//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         Node mid = slow;

//     //reverse 2nd half
//     Node curr = mid.next;
//     Node prev = null;
//     mid.next = null;
//     Node next;
//     while (curr!=null) {
//         next = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = next;

//     }

//     Node left = head;
//     Node right = prev;
//     Node nextL,nextR;

//     while (left!=null && right!=null) {
//         nextL = left.next;
//         left.next = right;
//         nextR = right.next;
//         right.next = nextL;

//         left = nextL;
//         right = nextR;

//     }
// }
//     public static void main(String[] args) {
//       LinkedList ll = new LinkedList();
//      ll.addLast(1);
//      ll.addLast(2);
//      ll.addLast(3);
//      ll.addLast(4);
//      ll.addLast(5);

//      ll.print();
//      ll.ZIGZAG();
//      ll.print();


    public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ll.addFirst(1);
      ll.addFirst(2);
      ll.addFirst(3);
      ll.addFirst(4);

      ll.print();
      head = ll.mergeSort(head);
      ll.print();

    }

}


