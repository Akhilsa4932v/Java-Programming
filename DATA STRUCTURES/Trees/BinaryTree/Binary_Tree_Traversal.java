
import java.util.*;
import java.util.LinkedList;

public class Binary_Tree_Traversal{

    //Node class
   static class Node{
        int data;
        Node left;
        Node right;

        //constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

  //BUILDING A TREE CLASS AND ITS TRAVERSAL METHODS.


    static class  BinaryTree{

        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

//PREORDER TRAVERSAL

        //After building tree now , printing the values of tree in preorder format.
        public static void preorder(Node root){ //O(n) == traveling each node .
            if(root == null){
                // System.out.print("-1"+" ");
                return;
            }

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }


//INORDER TRAVERSAL

        public static void inorder(Node root){
            if(root == null){
                // System.out.print("-1"+" ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

//POSTORDER TRAVERSAL

        public static void postorder(Node root){
            if(root == null){
                // System.out.print("-1"+" ");
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
//LEVELORDER TRAVERSAL.

        public static void levelOrder(Node root){

            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }

             }
        }
    }


}
    public static void main(String[] args) {
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new  BinaryTree ();
        // Node root = tree.buildTree(nodes);
       
        // System.out.println(root.data);

        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        // tree.levelOrder(root);


        // calculating height of tree

        //      1
        //     / \
        //    2   3
        //   / \ / \
        //  4  5 6  7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);    
    }


}