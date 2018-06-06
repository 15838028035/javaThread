package com.lj.ch02;

public class JoinThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running  ......");
	}

	public static void main(String []args) throws Exception{
		JoinThreadTest runableThreadTest = new JoinThreadTest();
		
		Thread t1 = new Thread(runableThreadTest, "JoinThreadTest-thread0");

		t1.start();
		t1.join();//主线程愿意等待当前线程执行
		
		System.out.println("end");
	}
}
