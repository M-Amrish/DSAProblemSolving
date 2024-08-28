package Leetcode_Problems.PracticeProblem.Trees.TreeBasics;

class TreeNodes{
    public int val;
    TreeNodes left;
    TreeNodes right;
    TreeNodes(int val){
        this.val = val;
        right = left = null;
    }
}
public class Size {
    public static void main(String[] args) {
        TreeNodes root = new TreeNodes(14);

        root.left= new TreeNodes(18);
        root.left.left = new TreeNodes(7);

        root.left.right = new TreeNodes(3);


        root.right = new TreeNodes(19);

        root.right.right = new TreeNodes(8);

        root.right.right.left = new TreeNodes(4);

        root.right.right.right = new TreeNodes(15);


        int ans = size(root);
        System.out.println(ans);

    }

    private static int size(TreeNodes root) {

        if(root == null){
            return 0;
        }

        return size(root.left) + size(root.right) +1;
    }

}
