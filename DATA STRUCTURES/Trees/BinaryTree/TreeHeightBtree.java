
//day 29 binary trees.

//calculating tree height,no of nodes,sum of nodes,Diameter of tree.

public class TreeHeightBtree {
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

//calc height of tree
   public static int height(Node root){

    if(root == null){
        return 0;
    }

    int left_height = height(root.left);
    int right_height = height(root.right);

    return Math.max(left_height,right_height) + 1 ;

    
}
//calc no.of nodes in tree .
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

       int left_count = countNodes(root.left);
       int right_count = countNodes(root.right);

       return left_count + right_count + 1;

    }

//calc sum of nodes.

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

       int left_sum = sumOfNodes(root.left);
       int right_sum = sumOfNodes(root.right);

       return left_sum + right_sum + root.data;
    }

//Diameter.
    public static int Diameter(Node root){ //O(N^2)
        if(root==null){
            return 0;
        }

        int leftDiam = Diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiam = Diameter(root.right);
        int rightHeigth = height(root.right);
        
        int selfDiam = leftHeight + rightHeigth + 1;
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }

    //Check given exact subtree exists in the tree or not

    public static boolean isIdentical(Node node,Node subRoot){

        if(node==null && subRoot == null){
            return true;
        }else if(node==null || subRoot == null || node.data!=subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubTree(Node root,Node subRoot){
        
        if(root==null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }


public static void main(String[] args) {
   
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
    
    
//     2   
//    / \ 
//    4  5 

    // Node subRoot = new Node(2);
    // subRoot.left = new Node(4);
    // subRoot.right = new Node(5);

// System.out.println(isSubTree(root, subRoot));


 }
}
