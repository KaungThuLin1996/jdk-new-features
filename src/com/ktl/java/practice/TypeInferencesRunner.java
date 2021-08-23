package com.ktl.java.practice;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		System.out.println(getDayOfWeek(0));
	}

	private static String getDayOfWeek(int day) {
		var dayOfWeek = switch (day) {
		case 0 -> {
			System.out.println("Added some logic here!");
			yield "Sunday";
		}
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> throw new IllegalArgumentException("Invalid Option : " + day);
		};
		return dayOfWeek;
	}

}
