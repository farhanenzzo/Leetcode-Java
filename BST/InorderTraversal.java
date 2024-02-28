package BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

    public List<Integer> inTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

//        if(root == null) return list;
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;

        }
        return list;
    }
    public static boolean isSorted(List<Integer> list) {
        int size = list.size();

        for (int i = 1; i < size; i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false; // If any adjacent elements are out of order, the list is not sorted
            }
        }

        return true; // All adjacent elements are in order, so the list is sorted
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

        InorderTraversal inorderTraversal = new InorderTraversal();
        System.out.println("In order" + inorderTraversal.inTraversal(a));
        // check if it is sorted , if sorted then it is a BST
        System.out.println(isSorted(inorderTraversal.inTraversal(a)));

    }
}

