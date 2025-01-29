
import java.util.*;
public class StackQuestions{
    


    //push ele in bottom of stack.
    public static void pushAtBottom(Stack<Integer> s, int data){
        
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
        
    }

    //reverse a string

    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    //reversse a stack
    public static void reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }
        
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void  printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
       //1. 
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

        //2.
        String str = "akhil";
        String result = reverse(str);
        System.out.println(result);

        //3.
            s.push(1);
            s.push(2);
            s.push(3);
            //3,2,1

            reverseStack(s);
            printStack(s);
            //1,2,3
        

     
        
    }
}


