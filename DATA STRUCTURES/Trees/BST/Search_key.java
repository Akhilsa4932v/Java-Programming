
public class Search_key {
     

 static class Node{
    int data;
    Node left;
    Node right;

    //constructor
    Node(int data){
        this.data = data;
       
    }
}

public static Node insert(Node root,int val){
    if(root==null){
        root = new Node(val);
        return root;
    }

     if(root.data > val){
        root.left = insert(root.left, val);
        
     }else{
        root.right = insert(root.right, val);
     }

     return root;
}

//FIND A KEY IN THE BST TREE

public static boolean searckkey(Node root,int key){
    if(root == null){
        return false;
    }

    if(root.data == key){
        return true;
    }else if(key > root.data){
        return searckkey(root.right, key);
    }else{
        return searckkey(root.left, key);
    }

}
public static void main(String[] args) {

    int val[] = {5,1,3,4,2,7};
    Node root = null;

    //CONSTRUCT TREE
    for(int i=0;i<val.length;i++){
        root = insert(root,val[i]);
    }

    if(searckkey(root,1)){
        System.out.println("found");
    }else{
        System.out.println("not found");
    }


    
}
}
