package com.rlaul.greenbook;

import com.rlaul.datastructures.*;

//TODO : not tested
public class Q_2_5 {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyLinkedListNode lA1 = new MyLinkedListNode(6, null, null);
		MyLinkedListNode lA2 = new MyLinkedListNode(1, null, lA1);
		MyLinkedListNode lA3 = new MyLinkedListNode(7, null, lA2);
		
		MyLinkedListNode lB1 = new MyLinkedListNode(5, null, null);
		MyLinkedListNode lB2 = new MyLinkedListNode(9, null, lB1);
		MyLinkedListNode lB3 = new MyLinkedListNode(5, null, lB2);	
		
		MyLinkedListNode list3 = addLists(lA1, lB1, 0);
		System.out.println("  " + lA1.printForward());		
		System.out.println("+ " + lB1.printForward());			
		System.out.println("= " + list3.printForward());	
	}
	
	public static MyLinkedListNode addLists(MyLinkedListNode l1, MyLinkedListNode l2, int carry){
		MyLinkedListNode result = new MyLinkedListNode();
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
				MyLinkedListNode more = addLists(l1 == null ? null : l1.next, 
						   l2 == null ? null : l2.next, carry);
				result.setNext(more);
			}
		//}
		return result;
		
	}

}
