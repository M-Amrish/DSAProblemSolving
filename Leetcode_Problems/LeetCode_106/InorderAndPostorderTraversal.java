package Leetcode_Problems.LeetCode_106;

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

public class InorderAndPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length != postorder.length){
            return null;
        }
        TreeNode ans=create(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
        return ans;
    }


    public static TreeNode create(int in[], int is, int ie, int pos[], int ps, int pe){
        if(ps>pe){
            return null;
        }
        TreeNode root = new TreeNode(pos[pe]);
        int index = find(in,pos[pe]);
        int element = ie-index ;
        root.left = create(in,is,index-1,pos,ps,pe-element-1);
        root.right = create(in,index+1,ie,pos,pe-element,pe-1);

        return root;
    }

    public static int find(int C[], int data){

        for(int i=0;i<C.length;i++){
            if(C[i] == data){
                return i;
            }
        }
        return -1;
    }
}
