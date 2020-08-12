package com.rlaul.datastructures;

public class MyQueue<T> {

	private class QueueNode<T>{
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data){
			this.data = data;
		}

		@Override
		public String toString() {
			return "QueueNode [data=" + data + ", next=" + next + "]";
		}
	}
		
	private QueueNode<T> first;
	private QueueNode<T> last;
	
	public void add(T item){
		QueueNode<T> t = new QueueNode<T>(item);
		if(last!=null) {
			last.next = t;
		}
		last = t;
		if(first ==null){
			first = last;
		}
	}
	
	public T remove(){
		T item = first.data;
		first = first.next;
		if(first == null){
			last = null;
		}
		return item;
	}
	
	public T peek(){
		return first.data;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public int countItems() {
		QueueNode<T> i;
		int t = 0;
		for (i = first; i != null; i = i.next) {
			t = t + 1;
		}
		return t;
	}
	
	public boolean search(T item) {
		boolean found = false;
		QueueNode<T> i = first;
		while(i!=null) {
			if(i.data == item) {
				found = true;
				break;
			}
			i = i.next;
		}
		return found;
	}
	
	@Override
	public String toString() {
		return "MyQueue [" + first + ",\n count of items="+countItems()+ "]";
	}

	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println(q);
		System.out.println("10 found : "+q.search(10));
		Object firstItem = q.peek();
		System.out.println("Peeked Item:"+firstItem);
		Object removedItem = q.remove();
		System.out.println("Removed item:"+removedItem);
		removedItem = q.remove();
		System.out.println("Removed item:"+removedItem);
		
		System.out.println(q);
		firstItem = q.peek();
		System.out.println("Peeked Item:"+firstItem);
		System.out.println("10 found : "+q.search(10));
		System.out.println("30 found : "+q.search(30));
		
	}
}
