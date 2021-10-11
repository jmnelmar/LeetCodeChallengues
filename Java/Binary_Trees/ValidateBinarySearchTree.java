package Binary_Trees;
public class ValidateBinarySearchTree {
 
 
    public class TreeNode {
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
 

    public boolean isValidBST(TreeNode root) {
       return checkNode(root, Long.MIN_VALUE, Long.MAX_VALUE);
   }
   
   private boolean checkNode(TreeNode node, long min, long max) {
       if (node == null){
           return true;
       }
       if(node.val > min && node.val < max){
           return (checkNode(node.left, min, node.val) && checkNode(node.right, node.val, max));
       } else {
           return false;
       }
   }
   
   
}

