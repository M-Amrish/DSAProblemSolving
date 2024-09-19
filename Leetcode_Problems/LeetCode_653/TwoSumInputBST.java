package Leetcode_Problems.LeetCode_653;

import java.util.HashSet;

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

public class TwoSumInputBST {

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs = new HashSet<>();

        return solve(root, k, hs) ? true: false;
    }

    public boolean solve(TreeNode A, int B, HashSet<Integer> hs){
        if(A == null){
            return false;
        }

        if(hs.contains(B-A.val)){
            return true;
        }

        hs.add(A.val);


        boolean l = solve(A.left, B, hs);
        boolean r = solve(A.right, B, hs);

        return l || r;
    }
}
