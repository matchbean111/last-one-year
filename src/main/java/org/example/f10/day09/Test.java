package org.example.f10.day09;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        String s = "ABDEGJCFHKI";
        String t = "DBEJGACHKFI";
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        Test test = new Test();
        TreeNode root = test.build(charArray, 0, 10, charArray1, 0, 10);

        System.out.println(12);

        test.level(root);
        List<Integer> list = test.rightSideView(root);
        for (Integer i : list) {
            System.out.printf("%c ", i);
        }
      
        test.inorderNonRecr(root);
        test.level(root);

    }

    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();

        if (root == null)
            return res;
        queue.offer(root);

        while (!queue.isEmpty()) {

            int sz = queue.size();
            TreeNode tmp = null;
            for (int i = 0; i < sz; i++) {
                tmp = queue.poll();
                if (tmp.left != null)
                    queue.offer(tmp.left);
                if (tmp.right != null)
                    queue.offer(tmp.right);
            }

            res.add(tmp.val);
        }

        return res;
    }

    TreeNode build(char[] preorder, int preStart, int preEnd,
                   char[] inorder, int inStart, int inEnd) {
        // 前序位置，寻找左右子树的索引
        if (preStart > preEnd) {
            return null;
        }
        int rootVal = preorder[preStart];
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        int leftSize = index - inStart;
        TreeNode root = new TreeNode(rootVal);

        // 递归构造左右子树
        root.left = build(preorder, preStart + 1, preStart + leftSize,
                inorder, inStart, index - 1);
        root.right = build(preorder, preStart + leftSize + 1, preEnd,
                inorder, index + 1, inEnd);
        return root;
    }

    

    void level(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> stk = new LinkedList<>();
        stk.push(root);
        while (!stk.isEmpty()) {
            TreeNode node = stk.pop();
            System.out.printf("%c ", node.val);

            if (node.left != null) stk.push(node.left);
            if (node.right != null) stk.push(node.right);
        }
    }

    void preorderNonRecr(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> stk = new LinkedList<>();
        stk.push(root);
        while (!stk.isEmpty()) {
            TreeNode node = stk.pop();
            System.out.printf("%c ", node.val);
            if (node.right != null) stk.push(node.right);
            if (node.left != null) stk.push(node.left);
        }
    }

    void inorderNonRecr(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> stk = new LinkedList<>();
        TreeNode node = root;
        while (node != null || !stk.isEmpty()) {
            if (node != null) {
                stk.push(node);
                node = node.left;
            } else {
                node = stk.pop();
                System.out.printf("%c ", node.val);
                node = node.right;
            }
        }
    }

    public class TreeNode {
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

}
