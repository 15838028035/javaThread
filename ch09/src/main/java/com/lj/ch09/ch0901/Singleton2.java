package com.lj.ch09.ch0901;

/**
 * 使用这种策略就能将instance的实例化推迟到第一次使用Singleton2的时候。
 * 注意在getInstance方法上，我们加了synchronized关键字，只是为了防止在多线程下instance被多次创健。
 * 因此这种方法的缺点也就暴露出来了，那就是在竞争激烈的场合，其性能肯定会受到影响。
 *
 */
public class Singleton2 {
	 private Singleton2(){}
	    private static Singleton2 instance = null;
	    public static synchronized Singleton2 getInstance(){
	        if (instance == null)
	            instance = new Singleton2();
	        return instance;
	    }
}
