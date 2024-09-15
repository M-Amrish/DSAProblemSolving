package Leetcode_Problems.LeetCode_199;

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

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> al = new ArrayList<>();

        if(root == null) return al;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while( q.size() !=  0){

            int size = q.size();

            for(int i=1; i<=size; i++){

                TreeNode rem = q.remove();

                if(i == size){
                    al.add(rem.val);
                }

                if(rem.left != null){
                    q.add(rem.left);
                }

                if(rem.right != null){
                    q.add(rem.right);
                }

            }
        }

        return al;

    }
}
