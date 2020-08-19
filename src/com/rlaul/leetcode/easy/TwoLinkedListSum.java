package com.rlaul.leetcode.easy;

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

/*
 * Just like how you would sum two numbers on a piece of paper, we begin by summing the 
 * least-significant digits, which is the head of l1 and l2. Since each digit is in the 
 * range of 0…9, summing two digits may "overflow". For example 5+7=12. 
 * In this case, we set the current digit to 2 and bring over the carry = 1 to the 
 * next iteration. carry must be either 0 or 1 because the largest possible sum of 
 * two digits (including the carry) is 9 + 9 + 1 = 19.
 */
public class TwoLinkedListSum {

	public class ListNode {
		ListNode next;
		int val;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return val + " -> " + next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyNode = new ListNode(0);
		ListNode current = dummyNode;
		int carry = 0;
		while(l1!=null || l2!=null || carry!=0) {
			int v1 = 0, v2 = 0;
			if(l1!=null)
				v1 = l1.val;
			if(l2!=null)
				v2 = l2.val;
			
			//compute digit
			int val = v1+v2+carry;
			carry = val/10;
			val = val%10;
			//System.out.println("val:"+val+",carry:"+carry);
			current.next = new ListNode(val);
			
			//update pointer
			current = current.next;
			if(l1!=null) 
				l1 = l1.next;
			if(l2!=null)
				l2 = l2.next;
		}
		return dummyNode.next;
	}
	
	
	public static void main(String[] args) {
		TwoLinkedListSum twoLinkedListSum = new TwoLinkedListSum();
		ListNode l1 = twoLinkedListSum.new ListNode(2);
		l1.next= twoLinkedListSum.new ListNode(4);
		l1.next.next=twoLinkedListSum.new ListNode(3);
	
		ListNode l2 = twoLinkedListSum.new ListNode(5);
		l2.next= twoLinkedListSum.new ListNode(6);
		l2.next.next=twoLinkedListSum.new ListNode(4);
		
		System.out.println(l1);
		System.out.println(l2);
		
		ListNode sum = twoLinkedListSum.addTwoNumbers(l1, l2);
		System.out.println(sum);
	}


}
