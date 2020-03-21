package com.methodreference.newMethod;

public class Main {
	public static void main(String[] args) {
		Msg m = Message::new;
		Message m1 = m.createObject();
		m1.setMessage("Hello");
		System.out.println(m1.getMessage());
	}
}
