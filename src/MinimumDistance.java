import javax.swing.tree.TreeNode;

public class MinimumDistance {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        private int minDiff = Integer.MAX_VALUE;
        private TreeNode prev = null;

        private void inOrder(TreeNode root) {
            if (root == null) return;

            inOrder(root.left);

            if (prev != null) {
                minDiff = Math.min(minDiff, root.val - prev.val);
            }
            prev = root;

            inOrder(root.right);
        }

        public int minDiffInBST(TreeNode root) {
            inOrder(root);
            return minDiff;
        }
    }
    public static void main(String[] args) {
        MinimumDistance md = new MinimumDistance();
        TreeNode root = md.new TreeNode(4);
        root.left = md.new TreeNode(2);
        root.right = md.new TreeNode(6);
        root.left.left = md.new TreeNode(1);
        root.left.right = md.new TreeNode(3);

        Solution solution = md.new Solution();
        int result = solution.minDiffInBST(root);
        System.out.println("Minimum difference in BST: " + result);
    }

}
