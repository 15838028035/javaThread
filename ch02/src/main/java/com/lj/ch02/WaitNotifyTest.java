package com.lj.ch02;

public class WaitNotifyTest {

	final static Object obj = new Object();
	
	public static  class Thread1 extends Thread {
		
		@Override
		public void run() {
			System.out.println(System.currentTimeMillis()+ " T1 start");
			synchronized (obj) {
				try {

					System.out.println(System.currentTimeMillis()+ " T1 wait for object");
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			

			System.out.println(System.currentTimeMillis()+ " T1 end");
		}
	}
	
	public static  class Thread2 extends Thread {
		@Override
		public void run() {
			synchronized (obj) {

				System.out.println(System.currentTimeMillis()+ "T2 start,  T2 notify");
				obj.notify();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			

			System.out.println(System.currentTimeMillis()+ " T2 end");
		}
	}
	
	public static void main(String []args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		t1.start();
		t2.start();
		
	}
}
