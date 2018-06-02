package com.lj.ch99;

import java.util.ArrayList;

public class UnsafeArrayList {

	private static ArrayList al = new ArrayList<>();
	
	static class AddTask implements Runnable {
		public void run() {
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e)	{
				
			}
			
			for(int i=0;i<=100000;i++){
				al.add(i);
			}
		}
	}
	
	public static void main(String []args) {
		Thread thread1 = new Thread(new AddTask(),"T1");
		Thread thread2 = new Thread(new AddTask(),"T2");
		
		thread1.start();
		thread2.start();
		
		/*Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e)	{
						
					}
				}
			}
		},"t3");*/
		
	//	thread3.start();
	}
}
