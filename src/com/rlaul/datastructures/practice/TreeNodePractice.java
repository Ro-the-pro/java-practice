package com.rlaul.datastructures.practice;

public class TreeNodePractice {
	private Integer data;
	private TreeNodePractice leftChild;
	private TreeNodePractice rightChild;

	public TreeNodePractice(Integer data) {
		this.data = data;
	}
	
	public static TreeNodePractice addSorted(int[] data, int start, int end) {
		if(start<=end) {
			int mid  = (start+end)/2;
			TreeNodePractice newNode = new TreeNodePractice(data[mid]);
			newNode.leftChild = addSorted(data, start, mid-1);
			newNode.rightChild = addSorted(data, mid+1, end);
			return newNode;
		}
		return null;
	}
	
	public int height() {
		if(isLeaf())
			return 1;
		int left = 0, right = 0;
		if(this.leftChild!=null)
			left = this.leftChild.height();
		if(this.rightChild!=null)
			right = this.rightChild.height();
		return (left>right ? left+1 : right+1);
	}
	
	public int numOfLeafNodes() {
		int leftLeaves = 0, rightLeaves = 0;
		if(isLeaf())
			return 1;
		if(this.leftChild!=null)
			leftLeaves = this.leftChild.numOfLeafNodes();
		if(this.rightChild!=null)
			rightLeaves = this.rightChild.numOfLeafNodes();
		
		return leftLeaves+rightLeaves;
	}
	
	public boolean isLeaf() {
		if(this.leftChild==null && this.rightChild==null)
			return true;
		return false;
	}

	public void traverseInOrder() {
		if(this.leftChild!=null)
			this.leftChild.traverseInOrder();
		System.out.println(this + " ");
		if(this.rightChild!=null)
			this.rightChild.traverseInOrder();

	}

	public TreeNodePractice find(Integer data) {
		if(this.data == data)
			return this;
		if(this.data>data && this.leftChild!=null)
			return leftChild.find(data);
		else if (this.data <data && this.rightChild !=null)
			return rightChild.find(data);
		return null;

	}

	public void insert(Integer data) {
		if(data >=this.data) {
			if(this.rightChild==null){
				TreeNodePractice newNode = new TreeNodePractice(data);
				this.rightChild = newNode;
			}else {
				this.rightChild.insert(data);
			}
		}else {
			if(data <this.data) {
				if(this.leftChild == null) {
					TreeNodePractice newNode = new TreeNodePractice(data);
					this.leftChild = newNode;
				}else {
					this.leftChild.insert(data);
				}
			}
		}
	}
	
	public boolean delete(Integer data) {
		if(this.data == data) {
			this.data = null;
			return true;
		}
		TreeNodePractice node = find(data);
		if(node!=null) {
			node.data=null;
			if(node.leftChild!=null) {
				node.leftChild.rightChild = node.rightChild;
			}
			if(node.rightChild!=null) {
				node.rightChild.leftChild = node.leftChild;
			}
			return true;
		}
		return false;
	}

	public Integer largest() {
		
		if(this.rightChild!=null)
			return this.rightChild.data;
		
		return this.data;

	}

	public Integer smallest() {
		if(this.leftChild!=null)
			return this.leftChild.data;
		
		return this.data;

	}
	
	public void printTree() {
		//TBD
		
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public TreeNodePractice getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNodePractice leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNodePractice getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNodePractice rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return String.valueOf(this.data);
	}
}
