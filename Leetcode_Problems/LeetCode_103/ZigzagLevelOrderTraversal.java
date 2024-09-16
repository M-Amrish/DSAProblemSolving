package Leetcode_Problems.LeetCode_103;

import java.util.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class ZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        int cnt = 1;
        while (q.size() != 0) {

            int size = q.size();

            ArrayList<Integer> al = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode rn = q.remove();

                al.add(rn.val);

                if (rn.left != null) {
                    q.add(rn.left);
                }

                if (rn.right != null) {
                    q.add(rn.right);
                }

            }

            if (cnt % 2 == 0) Collections.reverse(al);

            result.add(al);
            cnt++;

        }

        return result;

    }
    }
