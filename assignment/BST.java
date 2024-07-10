package assignment;

class BSTNode {
    int key;
    BSTNode left, right;

    public BSTNode(int item) {
        key = item;
        left = right = null;
    }
}


public class BST {
    public static void main(String[] args) {
        BSTNode node = new BSTNode(30);
        node.left = new BSTNode(15);
        node.right = new BSTNode(20);
        node.left.left = new BSTNode(5);
        node.left.right = new BSTNode(10);
        node.right.left = new BSTNode(45);
        node.right.right = new BSTNode(50);


    }

    static int[] print(int[] arr, BSTNode root) {
        recursive(root);
        return arr;
    }

    static void recursive(BSTNode root) {
        if(root == null){
            return;
        }

    }


}
