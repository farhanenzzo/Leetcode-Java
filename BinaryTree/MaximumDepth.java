package BinaryTree;

public class MaximumDepth {
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

    public static int getHeight(Tree root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        Tree root = new Tree(10);
        root.left = new Tree(5);
        root.right = new Tree(20);
        root.left.left = new Tree(3);
        root.left.right = new Tree(7);
        root.right.left = new Tree(15);
        root.right.right = new Tree(25);
        root.right.right.right = new Tree(30);

        System.out.println(getHeight(root));

    }
}

/*
            10
           /  \
          5    20
         / \   / \
        3   7 15 25
                   \
                    30
 */
