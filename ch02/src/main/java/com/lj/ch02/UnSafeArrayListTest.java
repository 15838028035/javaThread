package com.lj.ch02;

import java.util.ArrayList;
import java.util.List;

public class UnSafeArrayListTest implements Runnable {


	private List<Integer> list = new ArrayList<Integer>();
	
 		@Override
		public void run() {
			for(int i=0;i<10000; i++) {
				list.add(i);
			}
		}

	
	public List<Integer> getList() {
		return list;
	}

	public static void main(String []args) throws Exception {
		UnSafeArrayListTest ListTest = new UnSafeArrayListTest();
		Thread t1 = new Thread(ListTest,"T1");
		Thread t2 = new Thread(ListTest,"T2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("list.size=" + ListTest.getList().size());
	}
}
