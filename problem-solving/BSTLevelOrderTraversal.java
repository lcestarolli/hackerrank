import java.util.*;
import java.util.LinkedList;

class Node2 {
    Node2 left,right;
    int data;
    Node2(int data){
        this.data=data;
        left=right=null;
    }
}
class BSTLevelOrderTraversal{

    static void levelOrder(Node2 root){
        Queue<Node2> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while(!nodeQueue.isEmpty()){
            Node2 node = nodeQueue.remove();
            System.out.print(node.data + " ");
            if (node.left!=null) nodeQueue.add(node.left);
            if (node.right!=null) nodeQueue.add(node.right);
        }
    }

    public static Node2 insert(Node2 root, int data){
        if(root==null){
            return new Node2(data);
        }
        else{
            Node2 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node2 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}