package Leetcode_Problems.LeetCode_701;

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

public class InsertBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root == null){
            TreeNode nn = new TreeNode(val);
            return nn;

        }

        if(root.val > val){
            root.left = insertIntoBST(root.left, val);
        }else{
            root.right = insertIntoBST(root.right, val);
        }

        return root;

    }
}
