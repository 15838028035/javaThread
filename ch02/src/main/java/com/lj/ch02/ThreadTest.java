package com.lj.ch02;

public class ThreadTest extends Thread{
	
	public ThreadTest(String string) {
		super(string);
	}

	public static void main(String []args) {
		Thread t1 = new ThreadTest("ThreadTest1");
		t1.start();
		
		System.out.println("id=" +t1.getId());
		System.out.println("name=" +t1.getName());
		
	  int activeCount = t1.activeCount();
	  
	  System.out.println("activeCount=" + activeCount);
	}
}
