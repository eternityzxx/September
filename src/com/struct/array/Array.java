package com.struct.array;
 
public class Array<E> {
	/**
	 * ������ݵ�����
	 */
	private E[] data;
	/**
	 * ����������������
	 */
	private int size;
	
	public Array(int capacity) {
		data = (E[])new Object[capacity];
		size = 0;
	}
	/**
	 * Ĭ�����鳤��10
	 */
	public Array() {
		new Array<>(10);
	}
	/**
	 * �õ����鳤��
	 */
	public int getCapacity() {
		return data.length;
	}
	/**
	 * ���������С
	 */
	public int getSize() {
		return size;
	}
	/**
	 * �ж������Ƿ�Ϊ��
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	/**
	 * ����index�����һ��Ԫ��
	 * 1.�ж������Ƿ���Ч
	 * 2.�ж������Ƿ��Ѿ����ˣ���������ô����
	 * 3.�Ӻ���ǰ��index����Ԫ�غ���һ��λ��
	 * 4.index������Ԫ�ظ�ֵ
	 * 5.size++
	 */
	public void add(int index, E e) {
		if(index < 0 || index > size) {
			throw new IllegalArgumentException("add failed, index must between 0 and size");
		}
		if(index == size) {
			resize( 2 * data.length);
		}
		for (int i = size -1; i >= index; i--) {
			data[i+1] = data[i];
		}
		data[index] = e;
		size++;
	}
	/**
	 * ��β�������Ԫ��
	 */
	public void addLast(E e) {
		add(size, e);
	}
	/**
	 * ��ͷ�������Ԫ��
	 */
	public void addFirst(E e) {
		add(0, e);
	}
	
	/**
	 * �Ƿ�������Ԫ��
	 */
	public boolean contains(E e) {
		for (E e1 : data) {
			if(e1.equals(e)) {
				return true;
			}
		}
		return false;
	} 
	
	/**
	 * ��̬����
	 * 1.�½�һ����������СΪָ����СnewCapacity
	 * 2.��֮ǰ��������Ԫ�ذ�ԭ��˳��ŵ��µ�������
	 * 3.��ԭָ��ָ��������
	 */
	private void resize(int newCapacity) {
		E[] newDate = (E[]) new Object[newCapacity];
		for(int i = 0; i < size; i++) {
			newDate[i] = data[i];
		}
		data = newDate;
	}
	/**
	 * ����Ԫ��E�������е�����
	 * 1.�������е����飬��ƥ�䵽(equals��==)��ô�������������򷵻�-1
	 */
	private int find(E e) {
		for (int i = 0; i < data.length; i++) {
			if(data[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * ɾ��Ԫ�ز�����ɾ��֮ǰ��λ��
	 * ���������򷵻�-1
	 */
	public int removeElement(E e) {
		int index = find(e);
		if(index != -1) {
			remove(index);
		}
		return index;
	}
	/**
	 * ��������ɾ��Ԫ��,������ɾ��Ԫ��
	 * 1.�ж������Ƿ���Ч
	 * 2.����������Ԫ�ر��浽����һ�����������ڷ���
	 * 3.������Ԫ�����ƣ�������С����
	 * 4.��size��������Ԫ����գ�����size-1
	 * 5.��̯�㷨���Ӷȡ�Ϊ��ֹ�㷨���Ӷ��񵴣�ֻ��size <= data.leng/4 ��ô���µ��������СΪԭ��С����֮һ
	 *   ע������������С����Ϊ0
	 */
	private E remove(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("index must between 0 and size -1");
		}
		E removeData = data[index];
		for(int i = index + 1; i < size; i++) {
			data[i-1] = data[i];
		}
		data[index] = null;
		size--;
		if(size <= data.length/4 && data.length /2 != 0) {
			resize(data.length /2);
		}
		return removeData;
	}
}