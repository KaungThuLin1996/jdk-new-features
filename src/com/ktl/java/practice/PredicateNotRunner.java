package com.ktl.java.practice;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	public static void main(String[] args) {
		var numbers = List.of(11, 22, 33, 44, 55, 77, 30, 80, 100);
		Predicate<Integer> evenPredicate = number -> number % 2 == 0;
		// output even numbers using evenPredicate
		numbers.stream().filter(evenPredicate).forEach(System.out::println);
		System.out.println("******************");
		// output odd numbers using negate
		numbers.stream().filter(evenPredicate.negate()).forEach(System.out::println);
		System.out.println("******************");
		// output even numbers using method reference
		numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);
		System.out.println("******************");
		// output odd numbers using Predicate.not
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
	}
	
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
}
