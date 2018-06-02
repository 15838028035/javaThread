package com.lj.ch02;

public class DaemonTest {

	public static class DemonThread extends Thread {

		@Override
		public void run() {
			while(true) {
				System.out.println("I am active");
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String []args) throws InterruptedException{
		Thread t = new DemonThread();
		t.setDaemon(true);
		t.start();
		
		Thread.sleep(2000);
	}
}
