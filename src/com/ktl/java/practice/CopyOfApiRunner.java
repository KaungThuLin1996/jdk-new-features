package com.ktl.java.practice;

import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		var names = List.of("John", "Peter", "Harry");
		var copyOfNames = List.copyOf(names);
		doNotChange(copyOfNames);
		System.out.println(copyOfNames);
	}
	
	private static void doNotChange(List<String> copyOfNames) {
		copyOfNames.add("Gallas");
		System.out.println(copyOfNames.size());
	}

}
