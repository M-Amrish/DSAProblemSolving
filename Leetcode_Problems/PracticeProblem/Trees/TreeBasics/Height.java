package Leetcode_Problems.PracticeProblem.Trees.TreeBasics;

class TreeNode{
    public int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        left = right = null;
    }

}

public class Height {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);

        int ans = height(root);
        System.out.println(ans);
    }

    public static int height(TreeNode root){
        if(root == null){
            return -1;
        }

        int l = height(root.left);
        int r = height(root.right);


        return Math.max(l,r)+1;
    }
}
