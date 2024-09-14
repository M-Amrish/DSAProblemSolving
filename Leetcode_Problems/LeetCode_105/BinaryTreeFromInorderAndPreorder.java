package Leetcode_Problems.LeetCode_105;

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
public class BinaryTreeFromInorderAndPreorder {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode ans = create(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);

        return ans;
    }


    public TreeNode create(int[] pre, int  ps, int pe, int[] in, int is, int ie){

        if(ps > pe || is > ie) return  null;

        int rootData = pre[ps];

        TreeNode root = new TreeNode(rootData);

        int idx = findIndex(rootData, in);

        int elementLST = idx - is;

        root.left = create(pre, ps+1, ps+elementLST, in, is, idx-1);

        root.right = create(pre, ps+elementLST+1, pe, in, idx+1, ie);

        return root;
    }


    public int findIndex(int val, int [] in){

        int n = in.length;

        for(int i=0; i<n; i++){

            if(val == in[i]){
                return i;
            }
        }

        return 0;
    }

}
