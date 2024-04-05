package com.rlaul.exercises;

public class AddTwoNumbersLinkedLists {

	public static void main(String[] args) {
		LLNode na1 = new LLNode(6);
		LLNode na2 = new LLNode(2, na1);
		LLNode na3 = new LLNode(3, na2);
		
		LLNode nb1 = new LLNode(4);
		LLNode nb2 = new LLNode(5, nb1);
		LLNode nb3 = new LLNode(6, nb2);
		
		addNumbers (na3, nb3);
	}
	
	private static LLNode addNumbers(LLNode l1, LLNode l2) {
		LLNode result = new LLNode(0);
		LLNode current = result;
		int carry = 0;
		
		while(l1!= null || l2 !=null) {
			//if(l1!=null && l2!=null)
			//	System.out.print(" for nodes n1:"+l1.val+", n2:"+l2.val);
			int sum = 0;
			
			if (l1!=null) {
				sum+=l1.val;
				l1=l1.next;
			}
			
			if(l2!=null) {
				sum+=l2.val;
				l2=l2.next;
			}
			
			LLNode newNode=new LLNode(sum % 10);
			sum+=carry;
			carry = sum/10;
			//System.out.print(" carry:"+carry);
			
			current.next = newNode;
			current = current.next;
			
			System.out.print(current.val + " | ");
			
		}
		
		if(carry > 0) {
			LLNode newNode = new LLNode(carry);
			System.out.print(newNode.val);
			current.next = newNode;
		}
		
		return result.next;
	}

}


class LLNode{
	
	int val; 
	LLNode next;
	
	public LLNode() {}
	
	public LLNode(int val, LLNode next) {
		this.val = val;
		this.next = next;
	}

	public LLNode(int data) {
		this.val = data;
		this.next = null;
	}
	
	
}
