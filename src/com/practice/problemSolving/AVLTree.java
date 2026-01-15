package com.practice.problemSolving;

class AVLNode {
    int val;
    int height;
    AVLNode left;
    AVLNode right;

    AVLNode(int val) {
        this.val = val;
        this.height = 1;
    }
}

public class AVLTree {

    private int height(AVLNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }
    private int getBalance(AVLNode node) {
        if (node == null) {
            return 0;
        }
        return height(node.left) - height(node.right);
    }
    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode z = y.right;

        x.right = y;
        y.left = z;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode z = x.left;

        y.left = x;
        x.right = z;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }
    public AVLNode insert(AVLNode root, int val) {
        if (root == null) {
            return new AVLNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);
        if (balance > 1 && val < root.left.val) {
            return rightRotate(root);
        }
        if (balance < -1 && val > root.right.val) {
            return leftRotate(root);
        }
        if (balance > 1 && val > root.left.val) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        if (balance < -1 && val < root.right.val) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public void preOrder(AVLNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        AVLNode root = null;
        int[] values = { 15, 10, 20, 8, 12, 16, 25 };
        for (int val : values) {
            root = tree.insert(root, val);
        }
        tree.preOrder(root);
    }
}
