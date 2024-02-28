package BST;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIV {

    private final Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {

        if (root == null) return false;

        if (set.contains(k - root.val)) return true;
        set.add(root.val);

        return findTarget(root.left, k) || findTarget(root.right, k);
    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(6);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = null;
        c.right = f;

        TwoSumIV twoSumIV = new TwoSumIV();
        System.out.println(twoSumIV.findTarget(a, 9));


    }
}
