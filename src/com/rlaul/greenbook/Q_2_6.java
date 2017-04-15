package com.rlaul.greenbook;


public class Q_2_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPalindrome(LinkedListNode node){
		LinkedListNode reversed = reverseAndClone(node);
		return isEqual(node, reversed);
	}

	private boolean isEqual(LinkedListNode node, LinkedListNode reversed) {
		// TODO Auto-generated method stub
		return false;
	}

	private LinkedListNode reverseAndClone(LinkedListNode node) {
		LinkedListNode head = new LinkedListNode();
		while(node!=null)
		{
			//assume linkedlist1 = 1 0 2 0 1
			//linkedli 
			LinkedListNode n = node.clone();
			n.next = head;
			head = n;
			
		}
		return null;
	}

}
