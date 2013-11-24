package SameTree;

/**
 * Definition for binary tree */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
    	if (p==null&&q==null) {
			return true;
		}
    	else if ((p==null&&q!=null)||(p!=null&&q==null)) {
			return false;
		}
    	return (isSameTree(p.left, q.left)&&isSameTree(p.right, q.right))&&(p.val==q.val)||
    		(isSameTree(p.left, q.right)&&isSameTree(p.right, q.left)&&(p.val==q.val));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeNode x = new TreeNode(0);
//		TreeNode y = new TreeNode(0);
		TreeNode x = new TreeNode(1);
		TreeNode y = new TreeNode(1);
		x.left = new TreeNode(2);
		y.left = new TreeNode(2);
		y.right = null;
		Solution mySolution = new Solution();
		System.out.println(mySolution.isSameTree(x, y));
	}
}