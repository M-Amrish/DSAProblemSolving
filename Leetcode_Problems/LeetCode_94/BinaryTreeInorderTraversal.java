package Leetcode_Problems.LeetCode_94;

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

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> in = new ArrayList<>();

        traversal(root, in);

        return in;
    }

    public void traversal(TreeNode root, List<Integer> in){

        if(root == null){
            return;
        }

        traversal(root.left, in);
        in.add(root.val);
        traversal(root.right, in);
    }

}
