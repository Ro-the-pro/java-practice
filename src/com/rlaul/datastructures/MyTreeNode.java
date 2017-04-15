package com.rlaul.datastructures;


public class MyTreeNode {
	
	public MyTreeNode left;
	public MyTreeNode right;
	public MyTreeNode parent;
	public int data;
	private int size = 0;
	
	public MyTreeNode(int d){
		data = d;
	}
	
	public void setLeft(MyTreeNode l){
		if(l!=null){
			this.left = l;
			l.parent = this;
		}
	}
	
	public void setRight(MyTreeNode r){
		if(r!=null){
			this.right = r;
			r.parent = this;
		}
	}
	
	public void insertElementInOrder(int  d){
		if(d<data){
			if(this.left==null)
			{
				setLeft(new MyTreeNode(d));
			}
			else{
				left.insertElementInOrder(d);
			}
		}else{
			if(this.right ==null){
				setRight(new MyTreeNode(d));
			}else{
				right.insertElementInOrder(d);
			}
		}
		size++;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isBinarySearchTree(){
		if(data <left.data || left.isBinarySearchTree()){
			return false;
		}
		if(data>right.data || right.isBinarySearchTree()){
			return false;
		}
		return true;
	}
	
	public int height(){
		
		int height = 0;
		int leftHeight = left!=null?left.height():0;
		int rightHeight = right!=null?right.height():0;
		height = 1+Math.max(leftHeight, rightHeight);
		return height;
	}

	public MyTreeNode search (int d){
		
		if(data ==d)
			return this;
		else if(data >d)
		{
			if(left!=null)
				return left.search(d);
		}
		else{
			if(right!=null)
				return right.search(d);
		}
		return null;
	}

	private static MyTreeNode createMinimalBST(int arr[], int start, int end){
		int mid = (start+end)/2;
		MyTreeNode n = new MyTreeNode(arr[mid]);
		n.setLeft(createMinimalBST(arr, 0, mid-1));
		n.setRight(createMinimalBST(arr, mid+1, end));
		return n;
	}
}
