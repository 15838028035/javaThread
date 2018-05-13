package com.lj.ch09.ch0901;

/**

  getInstance()方法没有加锁，在高并发环境下具有高性能。
        只有在getInstance()第一次调用的时候，才会实例化instance。这是因为这里巧妙地使用了静态内部类和类的初始化方式。

 *
 */
public class Singleton3{
    private Singleton3(){
        System.out.println("Singleton3 is created");
    }
    private static class SingletonHolder{//定义一个静态内部类来初始化Singleton
        private static Singleton3 instance = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return SingletonHolder.instance;
    }
}
	