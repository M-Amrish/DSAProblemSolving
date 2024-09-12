package Leetcode_Problems.LeetCode_145;

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
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> pos = new ArrayList<>();

        traversal(root, pos);

        return pos;
    }

    public void traversal(TreeNode root, List<Integer> pos){

        if(root == null){
            return;
        }

        traversal(root.left, pos);
        traversal(root.right, pos);
        pos.add(root.val);
    }
}
