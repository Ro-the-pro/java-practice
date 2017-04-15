package com.rlaul.greenbook;

import CtCILibrary.LinkedListNode;

public class Q_2_5 {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListNode lA1 = new LinkedListNode(6, null, null);
		LinkedListNode lA2 = new LinkedListNode(1, null, lA1);
		LinkedListNode lA3 = new LinkedListNode(7, null, lA2);
		
		LinkedListNode lB1 = new LinkedListNode(5, null, null);
		LinkedListNode lB2 = new LinkedListNode(9, null, lB1);
		LinkedListNode lB3 = new LinkedListNode(5, null, lB2);	
		
		LinkedListNode list3 = addLists(lA1, lB1, 0);
		System.out.println("  " + lA1.printForward());		
		System.out.println("+ " + lB1.printForward());			
		System.out.println("= " + list3.printForward());	
	}
	
	public static LinkedListNode addLists(LinkedListNode l1, LinkedListNode l2, int carry){
		LinkedListNode result = new LinkedListNode();
		int value =carry;
		//Linked
		//if(l1!=null && l2!=null){
			if(l1!=null)
				value+=l1.data;
			if(l2!=null)
				value+=l2.data;
			value+=carry;
			//carry = value%10;
			int resultDigit = value%10;
			carry = value/10;
			System.out.println("Value="+value);
			System.out.println("carry="+carry);
			System.out.println("resultDigit="+resultDigit);
			
			result.data=resultDigit;
			
			if((l1 !=null && l2!=null) )
			{
				System.out.println("l1.data="+l1.data);
				System.out.println("l2.data="+l2.data);
				LinkedListNode more = addLists(l1 == null ? null : l1.next, 
						   l2 == null ? null : l2.next, carry);
				result.setNext(more);
			}
		//}
		return result;
		
	}

}
