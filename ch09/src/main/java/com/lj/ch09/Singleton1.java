package com.lj.ch09;

/**
 * 实战Java高并发程序设计——单例模式

    1.对于使用频繁地对象，可以省略new操作花费的时间。特别是对于那些重量级对象而言，能够节省很多系统开销。

    2.由于new操作的频率减少，系统内存的使用频率也会降低。这将减少JVM的GC压力。


        我们要把Singleton类的构造函数设置成private，这是为了防止开发人员用过构造函数随意创建这个类的实例。
        instance则必须是private static的，private是为了防止instance被修改，保证其安全性；static是因为getInstance()方法是static的。
 *
 */
public class Singleton1{
	
	private Singleton1() {
		
	}
	
    private static Singleton1 instance = new Singleton1();
    
    public static Singleton1 getInstance(){
        return instance;
    }
}