package MaximumDepthofBinaryTree;
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	//递归解法：
	//递归获取左子树和右子树的深度
	//选最大者+1即为父节点的深度
	//递归结束时返回0
    public int maxDepth(TreeNode root) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (root==null) {
			return 0;
		}
        int left = maxDepth(root.left)+1;
        int right = maxDepth(root.right)+1;
        if (left>right) {
			return left;
		}
        else {
			return right;
		}
    }	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode x = new TreeNode(0);
		x.left = new TreeNode(0);
		Solution mySolution = new Solution();
		System.out.println(mySolution.maxDepth(x));
	}

}
