package com.imooc.singleton;

//懒汉模式  类内实例对象创建时并不初始化，直到第一次调用getInstance方法时，才能完成初始化操作
//用时间换空间
public class SingletonTwo {
	//1.创建私有构造方法
	private SingletonTwo(){
		
	}
	
	//2.创建静态的该类实例对象
	private static SingletonTwo instance = null;

	//3.创建静态方法的时候实例化对象
	public static SingletonTwo getInstance(){
		if(instance==null){
			instance = new SingletonTwo();
		}
		return instance;
	}
}
