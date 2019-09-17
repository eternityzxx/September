package com.struct.array;

public class MyArray {
    //����һ������
	private int [] intArray;
	//���������ʵ����Ч����
	private int elems;
	//�����������󳤶�
	private int length;
	//Ĭ�Ϲ���һ������Ϊ50������
	public MyArray() {
		elems = 0;
		length = 50;
		intArray = new int [length];
	}
	//���캯������ʼ��Ϊһ������Ϊlength������
	public MyArray(int length) {
		elems = 0;
		this.length = length;
		intArray = new int [length];
	}
	//��ȡ�������Ч����
	public int getSize() {
		return elems;
	}
	/**
	 * ������ʾԪ��
	 */
	public void display() {
		for(int i=0;i<elems;i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println();
	}
	/**
	 * ���Ԫ�� ���費������ظ�Ԫ��
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
	 * �����±��ȡԪ��	
	 */
	public int get(int i) {
		if(i<0||i>elems) {
			System.out.println("�����±�Խ��");
		}
		return i;	
	}
	/**
	 * ����Ԫ��
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
	 * ɾ��Ԫ��
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
	 * �޸�����
	 */
	public boolean modify(int oldValue,int newValue) {
		int i = find(oldValue);
		if(i==-1) {
			System.out.println("��Ҫ�޸ĵ����ݲ�����");
			return false;
		}else {
			intArray[i] = newValue;
			return true;
		}
	}
}
