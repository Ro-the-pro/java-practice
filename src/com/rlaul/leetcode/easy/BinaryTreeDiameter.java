package com.rlaul.leetcode.easy;

import com.rlaul.datastructures.course.bst.TreeNode;

/*
 * Given a binary tree, you need to compute the length of the diameter of the tree. 
 * The diameter of a binary tree is the length of the longest path between any two 
 * nodes in a tree. This path may or may not pass through the root.
 * E.g.
 *       1 -> 3
 *       |
 *  4 <- 2 -> 5
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 */
public class BinaryTreeDiameter {
	int ans;

	public int getAns() {
		return ans;
	}

	public int diameterOfBinaryTree(TreeNode root) {
		if(root==null || (root.leftChild == null && root.rightChild == null)) {
			return 0;
		}
		int ans = 1;
		depth(root);
		return ans-1;
	}

	private int depth(TreeNode node) {
		if(node == null)
			return 0;
		int leftDepth = depth(node.leftChild);
		int rightDepth = depth(node.rightChild);
		ans = Math.max(ans, leftDepth+rightDepth+1);
		System.out.println("current node:"+node.getData()+" | ans:"+ ans + " | leftDepth:"+leftDepth +" | rightDepth:"+rightDepth);
		return Math.max(leftDepth, rightDepth) +1;
	}

	public static void main(String[] args) {
		
		TreeNode n1 = new TreeNode(4);
		TreeNode n2 = new TreeNode(5);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(2,n1,n2);
		TreeNode root = new TreeNode(1,n4,n3);
		
		BinaryTreeDiameter obj = new BinaryTreeDiameter();
		obj.diameterOfBinaryTree(root);
		System.out.println("Diameter="+ obj.getAns());
	}

}
