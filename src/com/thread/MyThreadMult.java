package com.thread;

public class MyThreadMult extends Thread{
   public MyThreadMult() {
	// TODO Auto-generated constructor stub
   }
   
	public MyThreadMult(String name) {
	  super(name);
	// TODO Auto-generated constructor stub
   }

	public void run() {
		for(int i=0;i<100;i++) {
			//�߳����߻���������  ���Բ��Ƽ������߳�ִ��
			try {
				Thread.sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName()+"-->"+i);
		}
	}

}
