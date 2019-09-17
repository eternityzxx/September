package com.thread;

public class Demo1 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		   MyThread m1 = new MyThread("魏无羡");
	         MyThread m2 = new MyThread("蓝忘机");
	         //开启线程 CPU去执行run方法里面的内容
	         m1.start();
	         m2.start();
	}

}
