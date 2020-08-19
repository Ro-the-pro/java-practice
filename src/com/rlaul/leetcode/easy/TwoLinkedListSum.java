package com.rlaul.leetcode.easy;

import java.util.List;

/*
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single 
 * digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number
 * 0 itself. 
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class TwoLinkedListSum {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
		
		void setNext(ListNode n) {
			this.next = n;
		}

		@Override
		public String toString() {
			if(next!=null)
				return val + " -> " + next;
			else
				return Integer.toString(val);
		}
	}
	
	public TwoLinkedListSum(ListNode[] nodeList) {
		for (int i=0; i<nodeList.length-1;i++) {
			ListNode node = nodeList[i];
			ListNode nextNode = nodeList[i+1];
			node.setNext(nextNode);
		}
	}
	
	public TwoLinkedListSum() {}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}

	public static void main(String[] args) {
		TwoLinkedListSum twoLinkedListSum = new TwoLinkedListSum();
		ListNode l11 = twoLinkedListSum.new ListNode(2);
		ListNode l12 = twoLinkedListSum.new ListNode(4);
		ListNode l13 = twoLinkedListSum.new ListNode(3);
		ListNode[] node1List = {l11, l12, l13};
		new TwoLinkedListSum(node1List);		
		
		ListNode l21 = twoLinkedListSum.new ListNode(5);
		ListNode l22 = twoLinkedListSum.new ListNode(6);
		ListNode l23 = twoLinkedListSum.new ListNode(4);
		ListNode[] node2List = {l21, l22, l23};
		new TwoLinkedListSum(node2List);
		
		System.out.println(l11);
		System.out.println(l21);
		
		ListNode sum = twoLinkedListSum.addTwoNumbers(l11, l21);
		System.out.println(sum);
		
	}

}
