package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class ValidBST {
    static class Tree {
        int val;
        Tree left;
        Tree right;

        public Tree(int root) {
            this.val = root;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "Tree{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    static List<Integer> node = new ArrayList<>();

    public static List<Integer> printInorder(Tree root) {
        if (root != null) {
            printInorder(root.left);
            node.add(root.val);
            printInorder(root.right);
        }
        return node;
    }

//    public static boolean isSorted(List<Integer> numbers) {
//        for (int i = 0; i < numbers.size() - 1; i++) {
//            if (numbers.get(i) > numbers.get(i + 1)) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {

        Tree root = new Tree(10);
        root.left = new Tree(5);
        root.right = new Tree(20);
        root.left.left = new Tree(3);
        root.left.right = new Tree(7);
        root.right.left = new Tree(15);
        root.right.right = new Tree(25);

        List<Integer> inOrderNodeList = printInorder(root);
        System.out.println(inOrderNodeList);

//        boolean isValidBST = isSorted(inOrderNodeList);
//
//        if(isValidBST) {
//            System.out.println("Valid");
//        } else {
//            System.out.println("Invalid");
//        }
    }
}


/*
            10
           /  \
          5    20
         / \   / \
        3   7 15 25
 */

