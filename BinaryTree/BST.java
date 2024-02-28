package BinaryTree;

public class BST {

    static class Tree {
        int val;
        Tree left;
        Tree right;

        public Tree(int val) {
            this.val = val;
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

    public static void main(String[] args) {
        int[] nodes = {5, 1, 3, 4, 2, 7};
        Tree root = null;

        for(int n: nodes) {
            root = buildBST(root, n);
        }

        System.out.println(getHeight(root));
    }

    public static int getHeight(Tree root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    private static Tree buildBST(Tree root, int node) {
        if(root == null) {
            root = new Tree(node);
            return root;
        }

        if(root.val > node) {
            root.left = buildBST(root.left, node);

        } else {
            root.right = buildBST(root.right, node);
        }

        return root;
    }
}
