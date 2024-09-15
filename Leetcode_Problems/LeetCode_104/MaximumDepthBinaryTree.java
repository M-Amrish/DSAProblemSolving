package Leetcode_Problems.LeetCode_104;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class MaximumDepthBinaryTree {


    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        return Math.max(l, r) + 1;
    }
}
