package com.methodreference.newMethod;

public class Main {
	public static void main(String[] args) {
		Msg m = Message::new;
		m.createObject("Hello, Sonu");
	}
}
