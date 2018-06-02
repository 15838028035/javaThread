package com.lj.ch02;

public class ThreadTest extends Thread{
	
	public static void main(String []args) {
		ThreadTest t1 = new ThreadTest();
		t1.start();
		
		System.out.println("id=" +t1.getId());
		System.out.println("name=" +t1.getName());

	}
}
