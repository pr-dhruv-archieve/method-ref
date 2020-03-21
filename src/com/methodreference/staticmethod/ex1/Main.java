package com.methodreference.staticmethod.ex1;

public class Main {
	
	public static void sayNamaste() {
		System.out.println("Said Namsate");
	}
	
	public static void sayHi() {
		System.out.println("Say Hi");
	}
	
	public static void main(String[] args) {

		/**
		 * Syntax = ClassName::staticMethosName
		 * here, Hello must be @FunctionalInterface
		 */
		Hello h = Main::sayHi;
		h.sayHello();
	}
	
}