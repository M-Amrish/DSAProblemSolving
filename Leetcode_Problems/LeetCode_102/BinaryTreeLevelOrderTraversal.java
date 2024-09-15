package Leetcode_Problems.LeetCode_102;

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
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> al = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null ) return al;

        q.add(root);

        while( q.size() != 0){

            int size = q.size();

            List<Integer> temp = new ArrayList<>();

            for(int i=1; i<= size; i++){

                TreeNode rem = q.remove();

                if(rem.left != null){
                    q.add(rem.left);
                }

                if(rem.right != null){
                    q.add(rem.right);
                }

                temp.add(rem.val);
            }

            al.add(temp);
        }

        return al;


    }
}
