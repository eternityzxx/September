package com.struct.array;

public class MyArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //�����Զ����װ���ݽṹ�������СΪ4
		MyArray array = new MyArray(4);
		//���4��Ԫ�طֱ�Ϊ1,2,3,4
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		//��ʾ����Ԫ��
		array.display();
		//�±�Ϊ0��Ԫ��
		int i =array.get(0);
		System.out.println(i);
		//ɾ��4��Ԫ��
		array.delete(4);
		//��Ԫ��3�޸�Ϊ33
		array.modify(3,33);
		array.display();
	}

}
