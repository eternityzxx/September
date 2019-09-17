package com.struct.array;

public class MyArray {
    //定义一个数组
	private int [] intArray;
	//定义数组的实际有效长度
	private int elems;
	//定义数组的组大长度
	private int length;
	//默认构造一个长度为50的数组
	public MyArray() {
		elems = 0;
		length = 50;
		intArray = new int [length];
	}
	//构造函数，初始化为一个长度为length的数组
	public MyArray(int length) {
		elems = 0;
		this.length = length;
		intArray = new int [length];
	}
	//获取数组的有效长度
	public int getSize() {
		return elems;
	}
	/**
	 * 遍历显示元素
	 */
	public void display() {
		for(int i=0;i<elems;i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
	}
	/**
	 * 添加元素 假设不会添加重复元素
	 */
	public boolean add(int value) {
		if(elems == length) {
	    	return false;
		}else {
			intArray[elems] = value;
			elems++;
		}
		return false;
	}
	/**
	 * 根据下标获取元素	
	 */
	public int get(int i) {
		if(i<0||i>elems) {
			System.out.println("访问下标越界");
		}
		return i;	
	}
	/**
	 * 查找元素
	 */
	public int find(int searchValue) {
		int i;
		for(i = 0;i<elems;i++) {
			if(intArray[i] == searchValue) {
				break;
			}
		}
		if(i == elems) {
			return -1;
		}
		return i;
	}
	/**
	 * 删除元素
	 */
	public boolean delete(int value) {
		int k = find(value);
		if(k == -1) {
			return false;
		}else {
			for(int i = k;i<elems-1;i++) {
				intArray[i] = intArray[i+1];
			}
			elems--;
		}
		return true;
	}
	/**
	 * 修改数据
	 */
	public boolean modify(int oldValue,int newValue) {
		int i = find(oldValue);
		if(i==-1) {
			System.out.println("需要修改的数据不存在");
			return false;
		}else {
			intArray[i] = newValue;
			return true;
		}
	}
}
