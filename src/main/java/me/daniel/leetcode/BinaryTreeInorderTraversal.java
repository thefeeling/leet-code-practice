package me.daniel.leetcode;

import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example:
 *
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Output: [1,3,2]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal {

    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) return;
        if (root.left != null) {
            helper(root.left, res);
        }
        res.add(root.val);
        if (root.right != null) {
            helper(root.right, res);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal tree = new BinaryTreeInorderTraversal();
    }

}
