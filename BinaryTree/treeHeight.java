package BinaryTree;

import java.util.ArrayList;
import java.util.List;


public class treeHeight {

    static class Tree {
        int val;
        Tree left;
        Tree right;


        Tree(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int getHeight(Tree root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int getTotalNodesSum(Tree root) {
        if (root == null) {
            return 0;
        }
        int leftSub = getTotalNodesSum(root.left);
        int rightSub = getTotalNodesSum(root.right);

        return leftSub + rightSub + root.val;
    }

    public static int getTotalNodesCount(Tree root) {
        if (root == null) {
            return 0;
        }
        int leftSub = getTotalNodesCount(root.left);
        int rightSub = getTotalNodesCount(root.right);

        return leftSub + rightSub + 1;
    }

    static List<Integer> list = new ArrayList<>();

    public static List<Integer> inOrder(Tree root) {

        if (root == null) {
            return list;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);

        return list;

    }

    public static void main(String[] args) {

        Tree root = new Tree(10);
        root.left = new Tree(5);
        root.right = new Tree(20);
        root.left.left = new Tree(3);
        root.left.right = new Tree(7);
        root.right.left = new Tree(15);
        root.right.right = new Tree(25);

        System.out.println("Height/depth of a Binary tree: " + getHeight(root));
        System.out.println("Count of nodes: " + getTotalNodesCount(root));
        System.out.println("Sum of all nodes: " + getTotalNodesSum(root));
        System.out.println(inOrder(root));
    }
}


//                                    10
//                                   /  \
//                                  5    20
//                                 / \   / \
//                                3   7  15 25
