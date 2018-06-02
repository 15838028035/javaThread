package org.com.lj.ch02;

public class ThreadTest4 {

	public static void main(String []args) {
		int v1 = 999999999;
		int v2 = 999999999;
		
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		
		int avg = (v1+v2)/2;
		
		System.out.println("avg=" + avg);
	}
	
}
