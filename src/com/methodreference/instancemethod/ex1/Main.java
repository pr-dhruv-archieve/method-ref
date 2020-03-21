package com.methodreference.instancemethod.ex1;

public class Main {
	public void sayHello() {
		System.out.println("Hello sonu");
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Hello h = m::sayHello;
		h.say();
	}
	
}
