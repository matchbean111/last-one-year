package org.example.datastruct;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        BFS bfs = new BFS();
        bfs.bfs(null);
    }

    public void bfs(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            if (node.left != null) {
                deque.offer(node.left);
            }
            if (node.right != null) {
                deque.offer(node.right);
            }
            if (node.left == null && node.right == null) {
                System.out.println(node.val);
            }

        }
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        dfs(root.right);

        
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
