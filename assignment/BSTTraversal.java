package assignment;

/*
TreeNode Class
The TreeNode class represents a node in a binary tree, which has:

An integer value (val) that the node holds.
References to its left (left) and right (right) child nodes.

Methods:

public static void inorderTraversal(TreeNode root): Recursively performs in-order traversal starting from the root node. It prints the node values in ascending order.
Main Method:

In the main method, a sample BST is constructed:
The root node has a value of 5.
Nodes 3 and 8 are its left and right children respectively.
Further nodes are added to create a balanced BST structure.
Output:

The main method then calls inorderTraversal(root) to perform the in-order traversal starting from the root node (5).
The expected output of in-order Traversal: 2 3 4 5 6 8 9 would be printed, showing the nodes in ascending order as per the in-order traversal rule.
Explanation:
TreeNode Class: Defines the structure of each node in the binary tree.
BSTTraversal Class: Provides a method to traverse a BST in an in-order manner.
Usage in Main: Demonstrates the construction of a BST and the application of in-order traversal to print node values.

 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BSTTraversal {
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.print("In-order Traversal: ");
        inorderTraversal(root);
    }
}
