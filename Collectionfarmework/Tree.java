class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
    

}
public class Tree {
     static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);   // Left
        System.out.print(root.val + " "); // Root
        inorder(root.right);  // Right
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        inorder(root);
    }
    
}
