package trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryTree {
    public static int index = -1;
    public class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private Node buildTree(int[] preO){
        if(preO[++index] == -1) return null;
        Node root = new Node(preO[index]);
        Node left = buildTree(preO);
        Node right = buildTree(preO);
        root.left = left;
        root.right = right;
        return root;
    }
    private void preOrder(Node root){
        if(root != null){
            System.out.print(" -> "+root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    private void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(" -> "+root.data);
            inOrder(root.right);
        }
    }
    private void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" -> "+root.data);
        }
    }
    private void levelOrder(Node root){
        if(root == null) return;
        Deque<Node> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(" -> "+ curr.data);
            if(curr.left != null){
                q.offer(curr.left);
            }
            if(curr.right != null){
                q.offer(curr.right);
            }
        }

    }

    public static void main(String[] args){
        int[] preO = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        BinaryTree b = new BinaryTree();
        Node root = b.buildTree(preO);
        System.out.println(root.right.left.data); // 4
        System.out.print("preOrder Traversal");
        b.preOrder(root);
        System.out.println();
        System.out.print("inOrder Traversal");
        b.inOrder(root);
        System.out.println();
        System.out.print("postOrder Traversal");
        b.postOrder(root);
        System.out.println();
        System.out.print("levelOrder Traversal");
        b.levelOrder(root);
    }
}
