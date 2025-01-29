import java.util.Stack;

//2 5 -1 -1 -1  O(n);
public class Next_greater {
    public static void ng(){
        int arr[] = {6,8,0,1,-3};
        Stack<Integer> s = new Stack<>();
        int nextGre[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }

            if(s.isEmpty()){
                nextGre[i] = -1;
            }else{
                nextGre[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for(int i=0;i<nextGre.length;i++){
            System.out.print(nextGre[i]+" ");
        }
    }
 
    public static void main(String[] args) {
       ng();

    }
}


/*
 * public static void ng(){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] =  new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            nextGreater[i] = s.isEmpty()?-1:s.peek();

            s.push(arr[i]);
        }

        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
 
    public static void main(String[] args) {
       ng();

 */