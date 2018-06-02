package com.lj.ch02;

public class YiledThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running  ......");
	}

	public static void main(String []args) throws Exception{
		YiledThreadTest runableThreadTest = new YiledThreadTest();
		
		Thread t1 = new Thread(runableThreadTest);

		Thread t2 = new Thread(runableThreadTest);

		t1.start();
		t2.start();
		
		t2.yield();
		
	}
}
