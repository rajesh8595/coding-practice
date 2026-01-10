public class MinimumDistanceBTS {
    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }

    static class Solution {
        private int minDiff = Integer.MAX_VALUE;
        private TreeNode prev = null;

        // In-order traversal to find minimum difference
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
        // Create a sample BST
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        // Find minimum difference
        Solution sol = new Solution();
        int result = sol.minDiffInBST(root);
        System.out.println("Minimum distance between nodes: " + result);
    }
}
