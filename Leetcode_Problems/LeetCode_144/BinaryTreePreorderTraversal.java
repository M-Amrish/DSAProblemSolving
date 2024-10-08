package Leetcode_Problems.LeetCode_144;

import java.util.ArrayList;
import java.util.List;

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

public class BinaryTreePreorderTraversal {

    List<Integer> pre = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null){
            return pre;
        }

        pre.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);


        return pre;
    }
}
