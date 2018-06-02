package org.com.lj.ch02;

public class ThreadTest3 implements Runnable{

	public static void main(String []args) {
		Thread thread1 = new Thread(new ThreadTest3());
		thread1.start();
	}

	@Override
	public void run() {
		System.out.println("I'm runable");
	}
	
}
