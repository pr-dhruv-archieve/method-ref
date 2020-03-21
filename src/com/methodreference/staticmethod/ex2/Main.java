package com.methodreference.staticmethod.ex2;

public class Main {

	public static void myThreadRun() {
		for (int i = 0; i < 10; i++)
			System.out.println("Inside My Thread");
	}

	public static void main(String[] args) {
		Thread t = new Thread(Main::myThreadRun);
		t.start();
		for(int i =0 ;i < 10;i++)
			System.out.println("Inside main method");
	}

}