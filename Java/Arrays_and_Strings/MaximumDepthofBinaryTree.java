package Arrays_and_Strings;
public class MaximumDepthofBinaryTree {
    
 
    public static class TreeNode {
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
 
    public static int maxDepth(TreeNode root) { 
        if(root == null)
            return 0;
        
            int maxLeft = maxDepth(root.left) + 1;
            int maxRight = maxDepth(root.right) + 1;
            
            if(maxLeft > maxRight)
                return maxLeft;
            else
                return maxRight;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        root.left = new TreeNode(9);
        System.out.println(maxDepth(root));


    }
    
}
