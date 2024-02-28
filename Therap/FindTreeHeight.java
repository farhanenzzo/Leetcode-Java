package Therap;

// todo: Define a node of a binary tree. Given the root node, write a method to find the height of the tree.

class Tree {

    int val;
    Tree left;
    Tree right;

    Tree(int val) {this.val = val;}
}

public class FindTreeHeight {

    public static void main(String[] args) {

        Tree root = new Tree(10);
        root.left = new Tree(5);
        root.right = new Tree(20);
        root.left.left = new Tree(3);
        root.left.right = new Tree(7);
        root.right.left = new Tree(15);
        root.right.right = new Tree(25);

        System.out.println("Height/depth of a Binary tree: " + getHeight(root));

    }

    private static int getHeight(Tree root) {
        if(root == null) return 0;

        int leftSub = getHeight(root.left);
        int rightSub = getHeight(root.right);
        return Math.max(leftSub, rightSub) + 1;
    }
}
