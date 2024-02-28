package BST;
import java.util.Stack;

public class ValidBST {

    private static boolean isValidBST(TreeNode currentRoot) {
        if (currentRoot == null) return true;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode prevRoot = null; // imp line
        while (currentRoot != null || !stack.isEmpty()) {
            while (currentRoot != null) {
                stack.push(currentRoot);
                currentRoot = currentRoot.left;
            }
            currentRoot = stack.pop();
            if(prevRoot != null && currentRoot.val <= prevRoot.val) return false; // this is the main logic for being BST, (<=, duplicate handle )
            prevRoot = currentRoot;
            currentRoot = currentRoot.right;
        }
        return true;
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

        System.out.println(isValidBST(a));
    }
}





//    private static List<Integer> inOrderTraversal(TreeNode currentRoot) {
//
//        List<Integer> list = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//
//        if(currentRoot == null) return list;
//
//        while (currentRoot != null || !stack.isEmpty()) {
//            while (currentRoot != null) {
//                stack.push(currentRoot);
//                currentRoot = currentRoot.left;
//            }
//            currentRoot = stack.pop();
//            list.add(currentRoot.val);
//            currentRoot = currentRoot.right;
//        }
//        return list;
//    }
