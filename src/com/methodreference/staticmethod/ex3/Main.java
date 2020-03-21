package com.methodreference.staticmethod.ex3;

import java.util.function.BiFunction;

public class Main {
	public static Integer add(Integer a, Integer b) {
		return a + b;
	}
	public static Float add(Integer a, Float b) {
		return a + b;
	}
	public static Float add(Float a, Float b) {
		return a + b;
	}

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder1 = Main::add;
		System.out.println(adder1.apply(10, 20));
		
		BiFunction<Integer, Float, Float> adder2 = Main::add;
		System.out.println(adder2.apply(10, 20.0f));
		
		BiFunction<Float, Float, Float> adder3 = Main::add;
		System.out.println(adder3.apply(10.0f, 20.0f));
	}
}
