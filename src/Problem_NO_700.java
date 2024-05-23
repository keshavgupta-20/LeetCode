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

public class Problem_NO_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val){
            return root;
        }
        if(val<root.val){
            return searchBST(root.left,val);
        }
        else{
            return searchBST(root.right, val);
        }
    }

    public static void main(String[] args) {
        Problem_NO_700 problem = new Problem_NO_700();
        TreeNode root = new TreeNode(4);
        root.right = new TreeNode(7);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 1;
        TreeNode result = problem.searchBST(root, val);
        if (result != null) {
            System.out.println("Node found with value: " + result.val);
        } else {
            System.out.println("Node with value " + val + " not found in the BST.");
        }

    }
}

