package com.rlaul.datastructures;

import java.util.EmptyStackException;

public class MyStack<T> {
	
	private class StackNode<T>{

		private T data; 
		private StackNode<T> next;
		
		public StackNode(T data){
			this.data = data;
		}
		
		@Override
		public String toString() {
			return "StackNode [data=" + data + ", next=" + next + "]";
		}
	}
	
	private StackNode<T> top;
	
	public T pop(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push (T item){
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top = t;
	}
	
	public T peek(){
		return top.data;
	}
	
	public boolean isEmpty(){
		return top ==null;
	}
	
	public int countItems() {
		int count = 0;
		StackNode<T> t = top;
		while(t!=null) {
			count++;
			t = t.next;
		}
		return count;
	}
	
	public boolean search(T item) {
		boolean found = false;
		StackNode<T> t = top;
		while(t!=null) {
			if (t.data == item) {
				return true;
			}
			t = t.next;
		}
		
		return found;
	}

	@Override
	public String toString() {
		return "MyStack [top=" + top + "\n count of items:"+countItems()+"]";
	}
	
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack);
		System.out.println("50 found : "+stack.search(50));
		Object firstItem = stack.peek();
		System.out.println("Peeked Item:"+firstItem);
		Object removedItem = stack.pop();
		System.out.println("Removed item:"+removedItem);
		removedItem = stack.pop();
		System.out.println("Removed item:"+removedItem);
		
		System.out.println(stack);
		firstItem = stack.peek();
		System.out.println("Peeked Item:"+firstItem);
		System.out.println("50 found : "+stack.search(50));
		System.out.println("30 found : "+stack.search(30));
	}
	

}
