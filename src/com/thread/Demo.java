package com.thread;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MyThread m1 = new MyThread("ÎºÎŞÏÛ");
         MyThread m2 = new MyThread("À¶Íü»ú");
         m1.start();
         m2.start();
	}

}
