package com.thread;

public class Demo1 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		   MyThread m1 = new MyThread("κ����");
	         MyThread m2 = new MyThread("������");
	         //�����߳� CPUȥִ��run�������������
	         m1.start();
	         m2.start();
	}

}
