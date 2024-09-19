package Leetcode_Problems.LeetCode_450;

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

public class DeleteNodeBST {

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;

        if(root.val > key){

            root.left = deleteNode(root.left, key);

        }else if(root.val < key){

            root.right = deleteNode(root.right, key);
        }else{

            if(root.left == null && root.right == null){

                return null;
            }else if(root.left != null && root.right == null){

                return root.left;
            }else if(root.right != null && root.left == null){

                return root.right;
            }else{

                TreeNode v = max(root.left);
                root.val = v.val;
                root.left = deleteNode(root.left,v.val);

            }

        }
        return root;
    }
    public static TreeNode max(TreeNode A){

        while(A.right != null){

            A = A.right;
        }

        return A;
    }
}
