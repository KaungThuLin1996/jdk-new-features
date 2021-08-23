package com.ktl.java.practice;

public class StringNewApiRunner {

	public static void main(String[] args) {
		// strip method
		System.out.println("  LR  ".strip().replace(" ", "^"));
		System.out.println("  LR  ".stripIndent().replace(" ", "^"));
		System.out.println("  LR  ".stripLeading().replace(" ", "^"));
		System.out.println("  LR  ".stripTrailing().replace(" ", "^"));
		// lines method
		"Spiderman\nBatman\rAntman\r\nAquaman".lines().forEach(System.out::println);
		// transform method
		System.out.println("UPPER".transform(s -> s.substring(2)));
		// formatted method
		System.out.println("My favourite movie is %s. This movie is released in %d.".formatted("Harry Polter", 2000));
		// isBlank method
		System.out.println("".isBlank());
		System.out.println("       ".isBlank());
	}

}
