package com.rlaul.test.datastructures;

import java.util.Arrays;

/**
 * This is a custom test implementation of ArrayList most widely used methods. 
 * @author rlaul
 *
 * @param <E>
 */
public class MyArrayList<E>  {
	private int size;
    private int DEFAULT_CAPACITY = 16;
    private Object[] elementData ={};
    
    public MyArrayList() {
		super();
		this.elementData = new Object[DEFAULT_CAPACITY];
	}

	public boolean add(E arg0) {
		ensureCapacity();
		elementData[size++] = arg0;
		return true;
	}

	public boolean remove(Object data) {
		for(int i=0;i<size;i++)
		{
			if(elementData[i]==data){
				elementData[i]=null;
				elementData[i]=elementData[i+1];
				size--;
				return true;
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public E remove(int index) {
	try{	
		
		if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
		}
		Object value = elementData[index];
		size--;
		System.out.println("value being removed:"+value+",size="+size()+",elementData.length="+elementData.length);
		for(int i=index;i<size;i++)
		{
			elementData[i]= elementData[i+1];
		}
		return (E) value;
	}
	catch(Exception e){
		e.printStackTrace();
		return null;
	}
	}
	
	public void add(int index, E data) {
		if (index<0 || index >=size)
			 throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
		size++;
		ensureCapacity();
		Object temp = elementData[index];
		elementData[index] = data;
		
		for(int i=size-1;i>index;i--){
			elementData[i+1] = elementData[i];
		}
		elementData[index+1] = temp;
		System.out.println("Item added at index="+index+":"+data+". Verifying item at this index:"+get(index));
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
		}
		return (E) elementData[index];
	}


	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	private void ensureCapacity() {
		if(size == elementData.length)
		{
			int newSize = size*2;
			elementData = Arrays.copyOf(elementData, newSize);
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(elementData)+",size="+size();
	}

}
