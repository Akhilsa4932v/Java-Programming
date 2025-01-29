
// public class AvlTree{

//     static class Node{
//         int data,height;
//         Node left,right;

//         Node(int data){
//             this.data = data;
//             height = 1;
//         }
//     }

//     public static Node root;

//     public static int height(Node root){
//         if(root == null){
//             return 0;
//         }

//         return root.height;
//     }

//     public static int getBalance(Node root){
//         if(root == null){
//             return 0;
//         }

//         return height(root.left) - height(root.right);
//     }

//     public static Node insert(Node root,int key){
//             if(root == null)
//                 return new Node(key);
        
//             if(key<root.data)
//                 root.left = insert( root.left, key);
//             else if(key>root.data)
//                 root.right = insert(root.right, key);
//             else
//                 return root;

//         // update root height
//         root.height =  1 + Math.max(height(root.left),height(root.right));

//         //get root's balance factor
//         int bf = getBalance(root);

//         //Left Left case
//          if(bf>1 && key < root.left.data){
//             return rightRotate(root);
//          }

//          //Right right case
//          if(bf<-1 && key<root.left.data){
//             return leftRotation(root);
//          }

//          //Left right case
//          if(bf > 1 && key > root.left.data)
//             root.left = leftRotation(root.left);
//             return rightRotate(root);

//         //Right left case
//         if(bf<-1 && key > root.right.data){
//             root.left = leftRotation(root.left);
//             return rightRotate(root);
//         }

//         return root; //return if avl tree is balanced
//     }

// public static void main(String[] args) {
//     root = insert(root,10);
//     root = insert(root,20);
//     root = insert(root,30);
//     root = insert(root,40);
//     root = insert(root,50);
//     root = insert(root,25);

//     /* AVL TREE
//      30
//      /\
//     20 40 
//     /\   \
//    10 25 50
//     */
    
//     // preorder(root);

// }
// }
// //pending.............


