package com.rlaul.leetcode.easy;
/**
 * Definition for singly-linked list.
 */
 class ListNode {
	 int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class MergeTwoLists {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 ==null)
			return l2;
		if(l2 == null)
			return l1; 
		
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}
		else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2; 
		}
	}
	
	// Helper function to print a given linked list
	public static void printList(ListNode head)
	{
		ListNode ptr = head;
		while (ptr != null)
		{
			System.out.print(ptr.val + " —> ");
			ptr = ptr.next;
		}
		
		System.out.println("null");
	}

	public static void main(String[] args) {
		ListNode l14 = new ListNode(4);
		ListNode l12 = new ListNode(2, l14);
		ListNode l11 = new ListNode(1,l12);
		
		ListNode l23 = new ListNode(3);
		ListNode l22 = new ListNode(2, l23);
		ListNode l21 = new ListNode(1,l22);
		
		MergeTwoLists obj = new MergeTwoLists();
		ListNode resultListNode = obj.mergeTwoLists(l11, l21);
		printList(resultListNode);
	}
}
