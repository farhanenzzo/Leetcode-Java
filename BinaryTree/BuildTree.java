package BinaryTree;

public class BuildTree {

    static class Tree {
        int val;
        Tree left;
        Tree right;

        public Tree(int root) {
            this.val = root;
            this.left = null;
            this.right = null;
        }
    }

    public static void printInorder(Tree root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }

    public static void printPreorder(Tree root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    public static void printPostorder(Tree root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {

        Tree root = new Tree(10);
        root.left = new Tree(5);
        root.right = new Tree(20);
        root.left.left = new Tree(3);
        root.left.right = new Tree(7);
        root.right.left = new Tree(15);
        root.right.right = new Tree(25);

        System.out.print("In Order: ");
        printInorder(root);
        System.out.println();
        System.out.print("Pre Order: ");
        printPreorder(root);
        System.out.println();
        System.out.print("Post Order: ");
        printPostorder(root);

    }
}


/*
            10
           /  \
          5    20
         / \   / \
        3   7 15 25
 */

