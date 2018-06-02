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
		t.setDaemon(true);//一定要在start前设置守护状态
		t.start();
		
		Thread.sleep(4000);
		
		//要守护线程不存在，守护线程自动退出,不再执行
	}
}
