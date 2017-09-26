package com.imooc.singleton;

//����ģʽ  ����ʵ�����󴴽�ʱ������ʼ����ֱ����һ�ε���getInstance����ʱ��������ɳ�ʼ������
//��ʱ�任�ռ�
public class SingletonTwo {
	//1.����˽�й��췽��
	private SingletonTwo(){
		
	}
	
	//2.������̬�ĸ���ʵ������
	private static SingletonTwo instance = null;

	//3.������̬������ʱ��ʵ��������
	public static SingletonTwo getInstance(){
		if(instance==null){
			instance = new SingletonTwo();
		}
		return instance;
	}
}
