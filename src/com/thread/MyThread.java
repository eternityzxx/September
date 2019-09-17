package com.thread;

public class MyThread extends Thread {
	//线程起名
	public MyThread() {
		
	}
	public MyThread(String name) {
		super(name);
	}
	/**
	 *public void run() {
	  for(int i=0;i<300;i++) {
		System.out.println(getName()+"-->"+i);
	  }
	}
	*/
	 public void run() {
		  for(int i=0;i<300;i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		  }
		}
	
}
