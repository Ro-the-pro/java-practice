package com.rlaul.greenbook;

import com.rlaul.datastructures.MyLinkedListNode;

//TODO : not tested
public class Q_2_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPalindrome(MyLinkedListNode node){
		MyLinkedListNode reversed = reverseAndClone(node);
		return isEqual(node, reversed);
	}

	private boolean isEqual(MyLinkedListNode node, MyLinkedListNode reversed) {
		// TODO Auto-generated method stub
		return false;
	}

	private MyLinkedListNode reverseAndClone(MyLinkedListNode node) {
		MyLinkedListNode head = new MyLinkedListNode();
		while(node!=null)
		{
			//assume linkedlist1 = 1 0 2 0 1
			//linkedli 
			MyLinkedListNode n = node.clone();
			n.next = head;
			head = n;
			
		}
		return null;
	}

}
