package com.lj.ch02;

public class RunableThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running  ......");
	}

	public static void main(String []args) throws Exception{
		RunableThreadTest runableThreadTest = new RunableThreadTest();
		
		Thread t1 = new Thread(runableThreadTest);
		Thread t2 = new Thread(runableThreadTest);
		Thread t3 = new Thread(runableThreadTest);

		t1.start();
		t2.start();
		t3.start();

		System.out.println("end");
	}
}
