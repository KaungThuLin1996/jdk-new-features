package com.ktl.java.practice;

public class TextBlocksRunner {

	public static void main(String[] args) {
		var textBlock = """
			 %s	Line 1
			 %s	Line 2
				    "Line 3"
			Line 4
				""".formatted("It is", "It's");
		System.out.println(textBlock);
	}

}
